---======function====---
--câu 1: đưa vào TENHV, trả ra số GV thỏa học vị, nếu không tìm thấy trả về 0
create function f_1 
(
@TENHV nvarchar(10)
)
returns int
as 
begin
	declare @sogv smallint
	if not exists(select*from hocvi where tenhv=@TENHV)
		begin
		set @sogv =0
		end
	else 
		begin
			select @sogv= count(*) 
			from gv_hv_cn
			where mshv = (select mshv from hocvi where tenhv=@tenhv)
		end
		return @sogv
end
---------------chạy f_1
declare @sogv smallint
set @sogv= dbo.f_1('TSKH')
if @sogv = 0 print N'Học vị này không tồn tại.'
else print N'Số giáo viên có học vị này là:  ' + cast(@sogv as char(6))


--function câu 2: đưa vào mshd, tính điểm trung bình của mã số đề tài
create function f_2
(
@msdt char(6)
)
returns float
as
begin
	declare @tbc float
	if not exists (select msdt from detai where msdt=@msdt)
		set @tbc = -1
	else
		---khai báo biến
		declare @hd float, @pb float, @uv float
		begin
			---gán điểm từ các bảng gv_hddt, gv_pbdt và gv_uvdt vào các biến @hd, @pb, @uv
			select @hd=(select diem from gv_hddt where msdt = @msdt)
			select @pb=(select diem from gv_pbdt where msdt = @msdt)
			select @uv = (select sum(diem) from gv_uvdt where msdt=@msdt)
			set @tbc = (@hd+@pb+@uv)/5
		end
		return @tbc
end
--execute cau 2
declare @tbc float
set @tbc = dbo.f_2('97004')
if @tbc = -1 print(N'Đề tài không tồn tại. Thử lại đi bạn ơi.')
else print (N'Điểm trung bình của đề tài này là : ') + cast(@tbc as char(6))

---câu 3: Đưa vào tên giáo viên, nhả ra số điện thoại giáo viên, nếu không có trả về 0
create function f_3
(
@tengiaovien nvarchar(30)
)
returns varchar(10)
as
begin
	--khai báo biến
	declare @sdt varchar(10)
	---nếu tên giáo viên không tồn tại, mặc định cho @sdt= 0
	if  not exists(select TENGV from giaovien where TENGV=@tengiaovien)
		set @sdt=0
	else 
		begin
			---truy vấn số điện thoại từ bảng giáo viên với điều kiện tengv phải bằng @tengiaovien
			select @sdt = sodt from giaovien where tengv=@tengiaovien
		end
	Return @sdt
end

--execute cau 3
declare @sdt varchar(10)
set @sdt = dbo.f_3(N'Hoàng Minh Nhật')
if @sdt = 0 print N'Giáo viên này không tồn tại đâu bạn ơi'
else print N'Số điện thoại của giáo viên này là:  ' + @sdt

--câu 4: đưa vào mshd nhà ra số điện thoại chủ tịch hội đồng, tên chủ tịch hội đồng
create function f_4
(
@mshd smallint
)
returns table
as 
	/* hàm trả về table không có begin end  */
	return(
		select sodt as N'Số điện thoại', tengv as N'Tên chủ tịch'
		from giaovien
		where msgv = (select msgvthd from hoidong where mshd=@mshd)
	)
-- execute f_cau4
declare @mshd smallint=2
if not exists(select * from dbo.f_4(@mshd))
	print N'Không co hoi dong'
else
	select * from dbo.f_4(@mshd)
--câu 5: Đưa vào TENGV Cho biết : Số đề tài hướng dẫn, số đề tài phản biện do giáo viên đó phụ trách
create function f_5
(
@tengv nvarchar(30)
)
returns table
as
	return(
		select count(h.MSDT) as N'Số DTHD', count(p.msdt) as N'Số DTPB phụ trách'
		from GV_HDDT h, GV_PBDT p
		---truy vấn lồng
		where h.msgv = (select (msgv) from giaovien where tengv = @tengv) 
					and  p.msgv = (select (msgv) from giaovien where tengv = @tengv) 
		)
--execute f_cau5
declare @tengv nvarchar(30) = N'Nguyễn Văn A'
if not exists(select * from dbo.f_5(@tengv))
	print N'Ủa bạn ơi giáo viên này không tồn tại mà??'
else
	select * from dbo.f_5(@tengv)