--- xem database

--- tạo database
create database QuanLyDeTaiTotNghiep;
use QuanLyDeTaiTotNghiep;
---create table

/* tạo bảng sinh viên*/
create table SINHVIEN 
(
MSSV char(6) primary key,
TENSV nvarchar(30) not null,
SODT varchar(10) not null,
LOP Char(6) not null,
DIACHI nvarchar(50)not null
)
/* tạo bảng đề tài */
create table DETAI
(
MSDT char(6) primary key,
TENDT nvarchar(30) not null
)
/* tạo bảng đề tài sinh viên */
create table SV_DETAI
(
MSSV char(6) primary key references SINHVIEN(mssv),
MSDT char(6) not null references DETAI(MSDT),
)
/*tạo bảng học hàm */
create table HOCHAM 
(
MSHH smallint primary key,
TENHH nvarchar(20) not null
)

/*tạo bảng giáo viên */
create table giaovien
(
MSGV smallint primary key,
TENGV nvarchar(30) not null,
DIACHI nvarchar(50) not null,
SODT varchar(10) not null,
MSHHAM smallint not null references HOCHAM(MSHH),
NAMHH smallint not null
)
/*tạo bảng HOCVI */
create table hocvi 
(
mshv smallint primary key,
tenhv nvarchar(10) not null
)
/* tạo bảng chuyên ngành */
create table CHUYENGANH
(
MSCH smallint primary key,
tencn nvarchar(30) not null
)
---tạo bảng GV_HV_CN
create table GV_HV_CN
(
msgv smallint references GIAOVIEN(msgv),
mshv smallint references HOCVI(mshv),
mscn smallint references CHUYENGANH(msch),
nam smalldatetime not null
primary key (msgv,mshv,mscn)
)
--- tạo bảng GV_HDDT
create table GV_HDDT 
(
msgv smallint primary key references GIAOVIEN(MSGV),
MSDT char(6) references DETAI(msdt),
DIEM float not null
)
--- tạo bảng GV_PBDT
create table GV_PBDT 
(
msgv smallint primary key references giaovien(msgv),
MSDT char(6) references DETAI(msdt),
DIEM float not null
)
---tạo bảng gv_uvdt
create table gv_uvdt
(
msgv smallint references giaovien(msgv),
MSDT char(6)  references DETAI(msdt),
DIEM float not null
primary key (msgv,msdt)
)

---tạo bảng HOIDONG
create table hoidong
(
MSHD smallint primary key,
phong smallint,
tgbg time,
ngayhd smalldatetime not null,
tinhtrang nvarchar(30) not null,
msgvthd smallint references giaovien(msgv)
)
---tạo bảng họi đồng giáo viên
create table HOIDONG_GV
(
MSHD smallint references hoidong(mshd),
msgv smallint references giaovien(msgv),
primary key (msgv, mshd)
)
---tạo bảng hội đồng_dt
create table hoidong_dt
(
mshd smallint references hoidong(mshd),
msdt char(6) references detai(msdt),
quyetdinh char(10)
)

---nhập dữ liệu----

---nhập bảng sinh viên---
insert into SINHVIEN(MSSV,TENSV,DIACHI,LOP,SODT)
values ('97TH01', N'Nguyễn Văn An', '12 NTMK', '97TH01', 9688543),
			 ('97TH02', N'Trần Hùng', '13/4 LCT', '97TH01', 8453443),
			  ('97TH03', N'Lê Thúy Hằng', '20 Pasteur','97TH01', 8544457),
			   ('97TH04', N'Ngô Khoa', '54/12 LHP', '97TH02', 8545439),
			    ('97TH05', N'Phạm Tài', '12 HBT', '97TH02', 8149023),
				 ('97TH06', N'Đinh Tiến', N'31 THĐ','97TH01', 8956123);
--- nhập bảng detai
insert DETAI (MSDT,TENDT)
values(97001, N'Quản lý thư viện'),
		(97002, N'Nhận dạng vân tay'),
		(97003, N'Bán đấu giá trên mạng'),
		(97004, N'Quản lý siêu thị'),
		(97005, N'Xử lý ảnh'),
		(97006, N'Quản lý database');
		select*from DETAI
		delete from detai
---nhập bảng sv_detai
insert SV_DETAI(MSSV,MSDT)
values ('97TH01',97004),
		('97TH02',97005),
		('97TH03',97001),
		('97TH04',97002),
		('97TH05',97003),
		('97TH06',97005);
---nhập bảng hocham
insert HOCHAM(MSHH,TENHH)
values (1, N'Phó giáo sư'),
		(2, N'Giáo sư');
---Nhập bảng hocvi
insert into hocvi(mshv,tenhv)
values (1, 'KS'),
		(2, 'CN'),
		(3, 'Th.S'),
		(4, 'TS'),
		(5, 'TSKH');
---nhập bảng giáo viên
insert into giaovien (MSGV,TENGV,DIACHI,SODT,MSHHAM,NAMHH)
values (1,N'Nguyễn Văn A', N'11 NVĐ', 8754321, 1, 1996),
		(2,N'Trần Thu Trang', N'56 XVNT', 8964334, 1, 1996),
		(3,N'Lê Trung', N'12/5 CMTT', 8903561, 1, 1996),
		(4,N'Nguyễn Thị Loan', N'321 BTX', 8012864, 2, 1997),
		(5,N'Chu V Tiên', N'1/60 TVĐ', 8157906, 2, 1997),
		(6,N'Hoàng Minh Nhật', N'11 HVT', 8214140,2,1996);
		select*from giaovien
		drop table giaovien
		drop table gv_uvdt
		drop table GV_HDDT
		drop table GV_HV_CN
		drop table GV_PBDT
		drop table HOIDONG_GV
		drop table hoidong
		drop table hoidong_dt
---nhập bảng chuyên ngành---
insert into CHUYENGANH(MSCH,tencn)
values (1, N'Hệ thống thông tin'),
			(2, N'Mạng'),
			(3, N'Đồ họa'),
			(4, N'Công nghệ phần mềm');
---Nhập bảng gv_hddt---
insert into GV_HDDT(msgv,MSDT,DIEM)
values (1,97001,7),
			(2,97002,8),
			(5,97003,9),
			(4,97004,8.5),
			(3,97005,7);
			select*from GV_HDDT
---nhập bảng gv_hv_cn
insert into GV_HV_CN(msgv,mshv,mscn,nam)
values (1,1,1,1999),
			(1,1,2,1999),
			(1,2,1,1998),
			(2,3,2,1997),
			(3,2,4,1997),
			(4,3,2,1996);
			select*from GV_HV_CN
---nhập bảng gv_pbdt
insert into GV_PBDT(msgv,MSDT,DIEM)
values (1,97005,5),
			(2,97001,7),
			(5,97004,6),
			(4,97003,8.5),
			(3,97002,8),
			(6,97006,9);
			select*from GV_PBDT
---nhập bảng gv_uvdt
insert into gv_uvdt(msgv,MSDT,diem)
values (5,97005,6),
			(2,97005,5),
			(4,97005,5),
			(3,97001,7),
			(4,97001,7),
			(5,97001,8),
			(3,97003,10),
			(1,97003,7),
			(2,97003,7),
			(1,97004,8),
			(2,97004,9),
			(3,97004,5),
			(1,97002,9),
			(4,97002,9),
			(5,97002,6),
			(1,97006,7),
			(2,97006,7),
			(4,97006,7);
			select*from gv_uvdt
			select*from detai
			select*from HOIDONG_GV
---nhập bảng hội đồng
insert into hoidong(MSHD,phong,tgbg,ngayhd,tinhtrang,msgvthd)
values (1,101,'7:00',CONVERT(DATE,'30/10/2001',103),N'Thật',1),
			(2,102,'7:00',CONVERT(DATE,'30/10/2001',103),N'Thử',2),
			(3,103,'8:00',CONVERT(DATE,'31/10/2001',103),' ',3),
			(4,104,'8:00',CONVERT(DATE,'31/10/2001',103),' ',4);
			delete from hoidong
			select*from hoidong
			
---nhập bảng hoidong_gv
insert into HOIDONG_GV(MSHD,msgv)
values(1,1),
			(1,2),
			(1,3),
			(1,4),
			(2,3),
			(2,2),
			(2,5),
			(2,4),
			(3,1),
			(3,2),
			(3,3),
			(3,4),
			(4,3),
			(4,2),
			(4,5),
			(4,4);
---nhập bảng hoidong_dt
insert into hoidong_dt(mshd,msdt,quyetdinh)
values (1,97001,N'Được'),
			(1,97002,N'Được'),
			(2,97003,N'Không'),
			(2,97004,N'không'),
			(1,97005,N'Được'),
			(3,97001,N'không'),
			(3,97002,N'Được'),
			(3,97004,N'không'),
			(4,97004,N'Không'),
			(4,97005,N'không'),
			(4,97006,N'không');
/* Dữ liệu thiếu: 
mã số hội đồng '4' của bảng hội đồng
mã số giáo viên số 6 của bảng giáo viên
mã số đề tài số 6 của bảng đề tài
*/

----==================TẠO CÁC ĐỐI TƯỢNG===================----

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

---execute câu 6
declare @kq int
execute @kq = cau6 97003
if @kq=0 print N'Mã số giáo viên không đúng'
else print N'Đã hoán đổi mã số giáo viên thành công'



----câu 7:  Đưa vào TENGV, TENSV. Hãy chuyển đề tài của sinh viên đó cho giáo viên mới hướng dẫn với TENGV là tham số vào. Nếu không tìm thấy, hoặc tìm thấy nhưng không duy nhất thì trả về  0, 1.
create 


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
declare @sogv int, @kq int
exec @kq=sp_cau1 'cn', @sogv output
if @kq = 0 
	print N'không có mshv tương ứng'
else 
	print  @sogv

---Câu 2:  . Đưa vào MSDT Cho biết : Điểm trung bình của đề tài, nếu không tìm thấy trả về 

create proc sp_cau2
(
@msdt char, @tbc float output
)
as
begin 
	if not exists (select*from detai where msdt=@msdt)
		return 0
	else 
		begin
			select avg(diem)
			from gv_uvdt
			where msdt = (select msdt from detai where msdt=@msdt)
			return 1
		end
end
go
---exec câu 2
declare @kq int, @tbc float
exec @kq=sp_cau2 97002 , @tbc output
if @kq = 0 
	print N'không có mshv tương ứng'
else 
	print  @tbc