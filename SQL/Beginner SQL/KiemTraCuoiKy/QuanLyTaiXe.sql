----CÂU 1: TẠO DATABASE LỆNH MÃ SQL---
---Tạo database---
Create database QuanLyTaiXe;
use QuanLyTaiXe;
--- Tạo các table---
/* bảng nhân viên */
create table NHANVIEN (
MaNV char(5) primary key,
HoTen varchar(50) ,
NgayVL smalldatetime,
HSLuong numeric(4,2),
MaPhong char(5),
)
/* bảng phòng ban */
create table PHONGBAN (
MaPhong char(5) primary key,
TenPhong varchar(25),
TruongPhong char(5),
)

/* bảng xe */
create table XE (
MaXe char(5) primary key,
LoaiXe varchar(20),
SoChoNgoi int,
NamSX int
)

/* bảng phân công */
create table PHANCONG (
MaPC char(5) primary key,
MaNV char(5),
MaXe char(5),
NgayDi smalldatetime,
NgayVe smalldatetime,
NoiDen varchar(25),
)

/* Thêm khóa ngoại  */
Alter table NHANVIEN
add constraint NHANVIEN_PHONGBAN_fk foreign key (MaPhong) references PHONGBAN (MaPhong),
constraint NHANVIEN_PHONGBAN_fk foreign key (MaNV) references PHONGBAN (TruongPhong) /* trưởng phòng cũng là nhân viên */


Alter table PHANCONG
add constraint PHANCONG_XE_fk foreign key (MaXe) references XE (MaXe),
constraint PHANCONG_NHANVIEN_fk foreign key (MaNV) references NHANVIEN (MaNV)


/*Tạo dữ liệu vào bảng */
insert into NHANVIEN (MaNV,HoTen,NgayVL,HSLuong,MaPhong)
values  ('00001', 'Hoang Van A', 2015-01-01, 7,'0000A'),
		   ('00002', 'Nguyen Van B', 2014-03-07, 6,'0000B'),
		   ('00003', 'Tran Thi C', 2017-04-08, 1.5,'0000B'),
		   ('00004', 'Vo Van D', 2019-05-06, 5.5,'0000B')

insert into PHONGBAN(MaPhong,TenPhong,TruongPhong)
values ('0000A', 'Noi Thanh', '00001'),
		   ('0000B', 'Ngoai Thanh', '00002')

insert into xe (MaXe,LoaiXe,SoChoNgoi,NamSX)
values ('TT001', 'Toyota', 4, 2003),
			('TT002', 'Toyota', 3, 2004)

insert into PHANCONG(MaPC,MaNV,MaXe,NgayDi,NgayVe,NoiDen)
values  ('12345','00001','TT001', 2022-3-1, 2022-3-7, 'Ha Noi'),
			('23456','00002','TT001', 2022-4-15, 2022-4-20, 'Tp HCM'),
			('34567','00001','TT002', 2022-5-15, 2022-5-20, 'Tp HCM'),
			('45678','00002','TT002', 2022-5-26, 2022-5-28, 'Ha Noi'),
			('56789','00003','TT001', 2022-5-26, 2022-5-28, 'Da Nang')

---CÂU 2: VIẾT CÁC CÂU LỆNH TRUY VẤN---
----a. Tìm nhân viên thuộc phòng lái xe "Ngoại thành"----
select MaNV, HoTen
from NHANVIEN nv, PHONGBAN pb
where nv.MaPhong=pb.MaPhong and TenPhong like 'Ngoai thanh'

----b. Tìm nhân viên thuộc phòng lái xe "Nội thành" được phân công lái loại xe Toyota có số chỗ ngồi là 4.----
select MaNV, HoTen
from NHANVIEN nv, PHONGBAN pb, Xe
where nv.MaPhong=pb.MaPhong and TenPhong like 'Noi thanh' and LoaiXe like 'Toyota' and SoChoNgoi =4

----c. Tìm nhân viên là trưởng phòng được phân công lái tất cả các loại xe---
select nv.MaNV, HoTen
from NHANVIEN nv, PHONGBAN pb, PHANCONG pc
where nv.MaNV=pb.TruongPhong and nv.MaNV=pc.MaNV
group by  nv.MaNV, HoTen
having count(distinct MaXe)= (select count(maxe) from xe) /* số loại xe trưởng phòng lái phải bằng tất cả loại xe có trong table XE */

----d. Trong mỗi phòng ban, tìm nhân viên được phân công lái xe toyota----
select distinct TenPhong, MaNV, HoTen
from NHANVIEN nv, PHONGBAN pb
where   pb.MaPhong=nv.MaPhong and  manv in (
																				select distinct manv 
																				from phancong
																				where MaXe like 'TT001' or maxe like 'tt002') /* xe hãng toyota bao gồm 2 mã, chỉ cần được phân công 1 trong hai là được tính */

