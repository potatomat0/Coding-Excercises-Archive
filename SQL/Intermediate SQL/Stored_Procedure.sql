---============A. STORED PROCEDURE VỚI THAM SỐ TRUYỀN VÀO========---
---Câu 1:  Tham số đưa vào là MSGV, TENGV, SODT, DIACHI, MSHH, NAMHH. Trước khi insert dữ liệu cần kiểm tra MSHH đã tồn tại trong table HOCHAM chưa, nếu chưa trả ra giá trị 0.
select*from giaovien
create procedure Cau1
@msgv smallint,
@tengv nvarchar(30),
@diachi nvarchar(50),
@sodt varchar(10),
@mshham smallint,
@namhh smallint
as
begin
	if exists(select*from hocham where mshh=@mshham)
		begin
			insert into giaovien(msgv, tengv, diachi, sodt, mshham, namhh)
			values(@msgv,@tengv,@diachi,@sodt,@mshham,@namhh)
			print N'Chèn dữ liệu thàn công'
		end
	else
		begin
			print N'Mã số học hàm chưa tồn tại'
			return 0
		end
END
GO
---xử lý hàm
execute Cau1
	@msgv= 7,
	@tengv = N'John Doe',
	@diachi = 'Moon Basse',
	@sodt = 069696969,
	@mshham = 2,
	@namhh = 1997


	sp_columns giaovien
	/* dùng lệnh này để copy thuộc tính bảng, tiện gõ khi nhập vào proc hơn */

---Câu 2:  Tham số đưa vào là MSGV, TENGV, SODT, DIACHI, MSHH, NAMHH Trước khi chèn dữ  liệu cần kiểm tra MSGV có trùng không, nếu trùng trả về giá trị 0
create proc cau2
@msgv smallint,
@tengv nvarchar(30),
@diachi nvarchar(50),
@sodt varchar(10),
@mshham smallint,
@namhh smallint
as
begin
	if not exists(select*from giaovien where @msgv=msgv)
		begin
			insert into giaovien(msgv, tengv, diachi, sodt, mshham, namhh)
			values(@msgv,@tengv,@diachi,@sodt,@mshham,@namhh)
			print N'Chèn dữ liệu thành công'
		end
	else
		begin
			print N'Mã số giáo viên bị trùng'
			return 0
		end
END
GO

---execute cau2
execute Cau2
	@msgv= 8,
	@tengv = N'John Doe',
	@diachi = 'Moon Basse',
	@sodt = 069696969,
	@mshham = 2,
	@namhh = 1997

---Câu 3: 3. Giống câu 1a, 1b kiểm tra xem MSGV có trùng không. MSHH tồn tại chưa Nếu MSGV trùng  trả về 0. Nếu MSHH chưa tồn tại trả về 1, ngược lại cho insert dữ liệu.
create proc cau3
@msgv smallint,
@tengv nvarchar(30),
@diachi nvarchar(50),
@sodt varchar(10),
@mshham smallint,
@namhh smallint
as
begin
	if not exists(select*from giaovien where @msgv=msgv) and exists(select*from hocham where mshh=@mshham)
		begin
			insert into giaovien(msgv, tengv, diachi, sodt, mshham, namhh)
			values(@msgv,@tengv,@diachi,@sodt,@mshham,@namhh)
			print N'Chèn dữ liệu thành công'
		end
	else
		if exists(select*from giaovien where @msgv=msgv)
			begin
				print N'Mã số giáo viên bị trùng'
				return 0
			end
		if  not exists(select*from hocham where mshh=@mshham)
			begin
				print N'Chưa tồn tại mã số học hàm'
				return 0
			end
END
GO
---execute cau 3
execute Cau3
	@msgv= 10,
	@tengv = N'John Doe',
	@diachi = 'Moon Basse',
	@sodt = 069696969,
	@mshham = 3,
	@namhh = 1997

---câu 4: Đưa vào MSDT cũ, TENDETAI mới. Hãy cập nhật TENDETAI mới với MSDT cũ không đổi nếu không tìm thấy trả về 0 ngược lại cập nhật và trả về 1
sp_columns detai
create proc Cau4
@MSDT char (6),
@TENDT nvarchar(30)
as
begin
	if exists (select * from DETAI where @MSDT = msdt)
		begin
			update DETAI set TENDT = @TENDT where MSDT = @MSDT
			return 1
			print N'Đổi tên đề tài thành công'
		end
	else
		begin
			print N'Mã số đề tài không tồn tại, cập nhật thất bại'
			return 0
		end
end
go
---execute câu 4
select*from detai
exec cau4
@msdt = 97001,
@tendt = 'Quản lý dự án'

---câu 5: Tham số đưa vào MSSV, TENSV mới , DIACHI mới Thủ tục dùng để cập nhật sinh viên trên.  Nếu không tìm thấy trả về 0, ngược lại cập nhật và trả về 1.
sp_columns sinhvien
create proc cau5
(
@mssv char(6),
@tensv_moi nvarchar(30),
@diachi_moi nvarchar(60)
)
as 
begin
	if exists (select*from sinhvien where mssv=@mssv)
		begin
			update sinhvien set TENSV=@tensv_moi where mssv=@mssv
			update sinhvien set DIACHI=@diachi_moi  where mssv=@mssv
			return 1
		end
	else return 0
end
go
---execute câu 5
select*from sinhvien
declare @kq int
exec @kq=cau5 '97TH01', N'Hoàng Minh Nhựt', '22 Đức Lợi'
if @kq=0 print N'mã số sinh viên không hợp lệ'
else print N'Cập nhật thành công'


---câu 6: Đưa vào MSDT hãy chuyển đổi sao cho với đề tài đó GVHD -> GVPB, GVPB-> GVHD. Nếu không tìm thấy trả về giá trị 0.
alter proc cau6 
@msdt char(10)
as
begin
	if not exists (select*from detai where msdt=@msdt)
		return 0
	else 
		begin
			 declare @pb smallint, @hd smallint
			 select @hd= msgv from gv_hddt where msdt=@msdt
			 select @pb= msgv from gv_pbdt where msdt=@msdt
			
			update gv_hddt set msgv=@pb where msdt=@msdt
			update gv_pbdt set msgv=@hd where msdt=@msdt

			return 1
		end
end
go






----câu 7:  Đưa vào TENGV, TENSV. Hãy chuyển đề tài của sinh viên đó cho giáo viên mới hướng dẫn với TENGV là tham số vào. Nếu không tìm thấy, hoặc tìm thấy nhưng không duy nhất thì trả về  0, 1.
create proc cau7 
(
@tengiaovien nvarchar(50), 
@tensv nvarchar(50)
)
as
begin
	declare @dem int
	select @dem=count(*) from giaovien where TENGV=@tengiaovien
	if @dem=0 
	return 0
	else if @dem>=2
	return 1
	
	else 
		begin
		declare @msgvhd smallint, @msdt nchar(10)
		select @msgvhd = msgv from giaovien where TENGV = @tengiaovien

		select @msdt=msdt from sv_detai,sinhvien
		where sv_detai.mssv = sinhvien.MSSV and tensv=@tensv
		update gv_hddt set msgv=@msgvhd where msdt = @msdt
		end
end
go

---execute câu 7
exec cau7 N'Nguyễn Thị Loan', 'Đình Tiến'

--- câu 8: . Đưa vào TENSV nếu không vi phạm ràng buộc toàn vẹn về khóa ngoại thì xóa. Ngược lại trả về 0
sp_columns sinhvien
create proc cau8
@tensv nvarchar(30)
as 
begin
	if exists (select*from SV_DETAI
	where mssv = (select MSSV from sinhvien where tensv=@tensv)
	return 0
	else
		begin 
			delete from sinhvien where tensv=@tensv
			return 1
		end
end

--execute câu 8
select*from sinhvien

declare @kq int
exec @kq = cau8 N'Lê Trang'
if @kq=0
print N'Sinh viên đang làm đề tài, không xóa được'
else print N'Đã xóa xong'






--===stored procedure
--câu 1: đưa vào TENHV, trả ra số GV thỏa học vị, nếu không tìm thấy trả về 0
sp_columns hocvi
select*from gv_hv_cn
select*from hocvi

create proc sp_cau1
(
@TENHV nvarchar(10),
@sogv int output
)
as
begin
	if not exists(select*from hocvi where tenhv=@TENHV)
		return 0
	else 
		begin
			select count(*) 
			from gv_hv_cn
			where mshv = (select mshv from hocvi where tenhv=@tenhv)
		end
end
GO
--execute cau1
select*from hocvi

declare @sogv int, @kq int
exec @kq=sp_cau1 'ks', @sogv output
if @kq = 0 
	print N'không có mshv tương ứng'
else 
	print  @sogv

---Câu 2:  . Đưa vào MSDT Cho biết : Điểm trung bình của đề tài, nếu không tìm thấy trả về 0
sp_columns detai
alter proc sp_cau2
(
@msdt char(6),
@tbc float output
)
as
begin 
	if not exists (select*from GV_HDDT where msdt=@msdt)
						and not exists (select*from GV_PBDT where msdt=@msdt)
						and not exists (select*from gv_uvdt where msdt=@msdt)
		return 0
	else 
		begin
			--khai báo biến
			declare @hd float,@pb float, @uv float
			--select từ các table giáo viên
			select @hd = diem
			from gv_uvdt
			where msdt = @msdt

			select @pb = diem
			from GV_PBDT
			where msdt=@msdt

			select @uv = sum(diem)
			from gv_uvdt
			where msdt =@msdt

			set  @tbc=(@hd+@pb+@uv)/5 
			return 1
		end
end
go
---exec câu 2
declare @tbc float , @kq int 
exec @kq=sp_cau2 97001 , @tbc output
if @kq = 0 
	print N'không có đề tài tương ứng'
else 
	print  @tbc

---câu 3: Đưa vào tengv trả ra sđt của gv, nếu không trả về 0
sp_columns giaovien
create proc sp_cau3 
(
@tengv nvarchar(30),
@sodt varchar(10) output
)
as 
begin
	if  not exists(select TENGV from giaovien where TENGV=@tengv)
		return 0
	else 
		begin
			select @sodt = sodt from giaovien where tengv=@tengv
			return 1
		end
end

--execute câu 3
select*from giaovien
declare @sdt varchar(10) ,@kq int
exec @kq=sp_cau3 N'John Doe', @sdt output
if @kq = 0
print N'Không có giáo viên tương ứng'
else print @sdt


---Câu 4: Nhập mshd nhả ra tên chủ tịch hội đồng và số điện thoại 
select*from hoidong
sp_columns hoidong
sp_columns giaovien
create proc sp_cau4 
(
@mshd smallint,
@tenchutich nvarchar(30) output,
@sdt varchar(10) output
)
as 
begin
	if not exists (select mshd from hoidong where mshd=@mshd)
		return 0
	else
		begin
		select @tenchutich = tengv, @sdt = SODT from giaovien where msgv= (select msgvthd from hoidong where mshd =@mshd)
		return 1
		end
end
go
--execute cau 4
declare @kq smallint, @mshd smallint, @sdt varchar(10) , @tenchutich nvarchar(30)
execute @kq = sp_cau4 3, @sdt output, @tenchutich output
if @kq=0 print N'Mã số hội đồng không tồn tại'
else print N'Tên chủ tịch là: ' + @tenchutich + N'số điện thoại là: ' + @sdt

--câu 5: Đưa vào TENHV Cho biết : Số đề tài hướng dẫn, số đề tài phản biện do giáo viên đó phụ trách
sp_columns detai
select*from giaovien
create proc sp_cau5
(
@tengv nvarchar(30),
@sohd smallint output,
@sopb smallint output
)
as
begin 
	if not exists (select tengv from giaovien where tengv=@tengv)
		return 0
	else
		begin
			select @sohd = count(msdt) from GV_HDDT where msgv = (select msgv from giaovien where TENGV=@tengv)
			select @sopb = count(msdt) from GV_pbdt where msgv = (select msgv from giaovien where TENGV=@tengv)
			return 1
		end
end

--exec câu 5
declare @kq smallint, @tengv nvarchar(30), @hd smallint, @pb smallint
exec @kq = sp_cau5 N'Nguyễn Văn A', @hd output, @pb output
if @kq = 0 print N'Mã số giáo viên không tồn tại'
else print N'Số đề tài hướng dẫn: ' +  cast(@hd as char(6)) + N' . Số đề tài phản biện: ' + cast(@pb as char(6)) 


			




		

