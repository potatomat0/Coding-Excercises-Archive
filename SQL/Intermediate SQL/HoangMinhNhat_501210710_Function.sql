---======function====---
--câu 1: đưa vào TENHV, trả ra số GV thỏa học vị, nếu không tìm thấy trả về 0
create function f_cau1 
(
@TENHV nvarchar(10)
)
returns int
as 
begin
	declare @sogv int
	if not exists(select*from hocvi where tenhv=@TENHV) --nếu không tồn tại tên học vị, gán số gv=0
		begin
		set @sogv =0
		end
	else 
		begin
			select @sogv= count(*) 
			from gv_hv_cn
			where mshv = (select mshv from hocvi where tenhv=@tenhv) --truy vấn lồng
		end
		return @sogv
end
--chạy cau1
declare @sogv int
set @sogv= dbo.f_cau1('Th.S') --nhập giá trị tham số truyền vào
if @sogv = 0 print N'Không có học vị tương ứng'
else print N'tổng số giáo viên có học vị này là: ' + cast(@sogv as char(6))

--function câu 2: đưa vào mshd, tính điểm trung bình của mã số đề tài
create function f_cau2
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
		declare @hd float, @pb float, @uv float
		begin
			--gán giá trị các biến @hd, @pb, @uv từ các bảng gv_hddt, gv_pbdt và gv_uvdt
			select @hd=(select diem from gv_hddt where msdt = @msdt)
			select @pb=(select diem from gv_pbdt where msdt = @msdt)
			select @uv = (select sum(diem) from gv_uvdt where msdt=@msdt)
			set @tbc = (@hd+@pb+@uv)/5
		end
		return @tbc
end
--chạy cau 2
declare @tbc float
set @tbc = dbo.f_cau2('97004')
if @tbc = -1 print(N'Đề tài này không tồn tại đâu bạn')
else print (N'Điểm trung bình của đề tài này là: ') + cast(@tbc as char(6))

---câu 3: Đưa vào tên giáo viên, nhả ra số điện thoại giáo viên, nếu không có trả về 0
create function f_cau3
(
@tengiaovien nvarchar(30)
)
returns varchar(10)
as
begin
	declare @sdt varchar(10)
	if  not exists(select TENGV from giaovien where TENGV=@tengiaovien) --nếu giáo viên không tồn tại, gán mặc định @sdt= 0
		set @sdt=0
	else 
		begin
			select @sdt = sodt from giaovien where tengv=@tengiaovien
		end
	Return @sdt
end

--chạy cau 3
declare @sdt varchar(10)
set @sdt = dbo.f_cau3(N'Nguyễn Văn A')
if @sdt = 0 print N'Giáo viên này không tồn tại á bạn'
else print N'Số điện thoại của giáo viên là: ' + @sdt

--câu 4: đưa vào mshd nhà ra số điện thoại chủ tịch hội đồng, tên chủ tịch hội đồng
create function f_cau4
(
@mshd smallint
)
returns table
as 
	/* hàm trả về table không có begin end  */
	return(
		select sodt as N'Số điện thoại', tengv as N'Tên chủ tịch'
		from giaovien
		where msgv = (select msgvthd from hoidong where mshd=@mshd) --truy vấn lồng
	)
-- chạy f_cau4
declare @mshd smallint=2 --nhập giá trị tham số truyền vào
if not exists(select * from dbo.f_cau4(@mshd))
	print N'Hội đồng này không tồn tại á bạn'
else
	select * from dbo.f_cau4(@mshd)
--câu 5: Đưa vào TENGV Cho biết : Số đề tài hướng dẫn, số đề tài phản biện do giáo viên đó phụ trách
create function f_cau5
(
@tengv nvarchar(30)
)
returns table
as
	return(
		select count(h.MSDT) as N'Số DTHD phụ trách', count(p.msdt) as N'Số DTPB phụ trách'
		from GV_HDDT h, GV_PBDT p
		--truy vấn lồng
		where h.msgv = (select (msgv) from giaovien where tengv = @tengv) 
					and  p.msgv = (select (msgv) from giaovien where tengv = @tengv) 
		)
--chạy f_cau5
declare @tengv nvarchar(30) = N'Nguyễn Văn A' 
if not exists(select * from dbo.f_cau5(@tengv))
	print N'Giáo viên này không tồn tại á bạn'
else
	select * from dbo.f_cau5(@tengv)