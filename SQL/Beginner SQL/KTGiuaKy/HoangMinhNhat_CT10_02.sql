﻿---Tạo database---
Create database csdlhk;
use csdlhk;
--- Tạo table---
create table CHUYENBAY (
MaCB char(5) primary key,
GaDi varchar(50) ,
GaDen varchar(50),
DoDai int,
GioDi time,
GioDen time,
ChiPhi int,
)
Create table MAYBAY (
MaMB int primary key,
Loai varchar(50),
TamBay int,
)
Create table NHANVIEN (
MaNV char(9) primary key,
Ten varchar(50),
luong int,
)
Create table CHUNGNHAN (
MaNV char(9),
MaMB int,
primary key (MaNV, MaMB)
)
---Tạo khóa ngoại---
Alter table CHUNGNHAN
add constraint CHUNGNHAN_NHANVIEN_fk foreign key (MaNV) references NHANVIEN (MaNV),
constraint CHUNGNHAN_MAYBAY_fk foreign key (MaMB) references MAYBAY (MaMB)
---- NHẬP DỮ LIỆU---
---Máy bay---
insert into MAYBAY (MaMB, Loai, TamBay)
values  (747, 'Boeing 747 - 400', 13488),
			(737, 'Boeing 737 - 800', 5413),
			(340, 'Airbus A340 - 300', 11392),
			(757, 'Boeing 757 - 300', 6416),
			(777, 'Boeing 777- 300', 10306),
			(767, 'Boeing 767 - 400ER', 10306 ),
			(320, 'Airbus A320', 4168 ),
			(319, 'Airbus A319', 2888 ),
			(727, 'Boeing 727', 2406 ),
			(154, 'Tupolev 154', 6565 );
---Chuyến Bay---
insert into CHUYENBAY (MaCB, GaDi, GaDen, DoDai, GioDi, GioDen, ChiPhi)
values ('VN431', 'SGN', 'CAH', 3693, '5:55', '6:55', 236),
			('VN320', 'SGN', 'DAD', 2798, '6:00', '7:10', 221),
			('VN464', 'SGN', 'DLI', 2002, '7:20', '8:05', 225),
			('VN216', 'SGN', 'DIN', 4170, '10:30', '14:20', 262),
			('VN280', 'SGN', 'HPH', 11979, '6:00', '8:00', 1279),
			('VN254', 'SGN', 'HUI', 8765, '18:40', '20:00', 781),
			('VN338', 'SGN', 'BMV', 4081, '15:25', '16:25', 375),
			('VN440', 'SGN', 'BMV', 4081, '18:30', '19:30', 426),
			('VN651', 'DAD', 'SGN', 2798, '19:30', '8:00', 221),
			('VN276', 'DAD', 'CXR', 1283, '9:00', '12:00', 203),
			('VN374', 'HAN', 'VII', 510, '11:40', '13:25', 120),
			('VN375', 'VII', 'CXR', 752, '14:15', '16:00', 181),
			('VN269', 'HAN', 'CXR', 1262, '14:10', '15:50', 202),
			('VN315', 'HAN', 'DAD', 134, '11:45', '13:00', 112),
			('VN317', 'HAN', 'UIH', 827, '15:00', '16:15', 190),
			('VN741', 'HAN', 'PXU', 395, '6:30', '8:30', 120),
			('VN474', 'PXU', 'PQC', 1584, '8:40', '11:20', 102),
			('VN476', 'UIH', 'PQC', 485, '9:15', '11:50', 117);
---Nhân viên---
insert into NHANVIEN(MaNV,Ten,Luong)
values  ('242518965','TRAN VAN SON',120433),
		('141582651','DOAN THI MAI',178345),
		('011564812','TON VAN QUY',153972),
		('567354612','QUAN CAM LY',256481),
		('552455318','LA QUE ',101745),
		('550156548','NGUYEN THI CAM',205187),
		('390487451','LE VAN LUAT',212156),
		('274878974','MAI ƯUOC MINH',99890),
		('254099823','NGUYEN THI QUYNH',24450),
		('356187925','NGUYEN VINH BAO',44740),
		('355548984','TRAN THI HAOI AN',212156),
		('310454876','TA VAN DO ',212156),
		('489456522','NGUYEN THI QUY LINH',127984),
		('489221823','BUI QUOC CHINH',23980),
		('548977562','LE VAN QUY',84476),
		('310454877','TRAN VAN HAO',33546),
		('142519864','NGUYEN THI XUAN DAO',227489),
		('269734834','TRUONG TUAN ANH',288950),
		('287321212','DUONG VAN MINH',48090),
		('552455348','BUI THI DUNG',92013),
		('248965255','TRAN THI BA',43723),
		('159542516','LE VAN KY',48250),
		('348121549','NGUYEN VAN THANH',32899),
		('574489457','BUI VAN LAP',20);
---Chứng nhận---

insert into CHUNGNHAN (MaNV, MaMB)
values ('567354612', 747),
	('567354612', 737),
	('567354612', 757),
	('567354612', 777),
	('567354612', 767),
	('567354612', 727),
	('567354612', 340),
	('552455318', 737),
	('552455318', 319),
	('552455318', 747),
	('552455318', 767),
	('390487451', 340),
	('390487451', 320),
	('390487451', 319),
	('274878974', 757),
	('274878974', 767),
	('355548984', 154),
	('310454876', 154),
	('142519864', 747),
	('142519864', 757),
	('142519864', 777),
	('142519864', 767),
	('142519864', 737),
	('142519864', 340),
	('142519864', 320),
	('269734834', 747),
	('269734834', 737),
	('269734834', 340),
	('269734834', 757),
	('269734834', 777),
	('269734834', 767),
	('269734834', 320),
	('269734834', 319),
	('269734834', 727),
	('269734834', 154),
	('242518965', 737),
	('242518965', 757),
	('141582651', 737),
	('141582651', 757),
	('141582651', 767),
	('011564812', 737),
	('011564812', 757),
	('574489457', 154);

---- PHẦN 2: Truy vấn dữ liệu---

---Chọn và kết---
---Câu 1: Tìm các nhân viên có lương nhỏ hơn 10,000---
select *
from NHANVIEN
where luong<10000
----Câu 2: Cho biết mã số của các phi công lái máy bay boeing---
select distinct nv.MaNV
from nhanvien nv, chungnhan cn
where nv.MaNV=cn.MaNV and mamb>700 /* mã máy bay boeing luôn bắt đầu bằng số 7 và có 3 chữ số*/
---Câu 3: Cho biết mã số của các loại máy bay mà nhân viên họ nguyễn có thể lái---
select distinct MaMB
from CHUNGNHAN cn, NHANVIEN nv
where cn.MaNV=nv.MaNV and Ten like 'NGUYEN %'

---Gom nhóm---

---Câu 4: Cho biết mã số của các phi công chỉ lái được 3 loại máy bay---
select  nv.MaNV
from NHANVIEN nv, CHUNGNHAN cn
where cn.MaNV=nv.MaNV
group by nv.MaNV
having count(mamb) = 3 

---Câu 5: Với mỗi phi công có thể lái nhiều hơn 3 loại máy bay, cho biết mã số phi công và tầm bay lớn nhất của các loại máy bay mà phi công đó có thể lái---
select nv.MaNV, max(TamBay) as N'Tầm bay lớn nhất'
from maybay mb, NHANVIEN nv, CHUNGNHAN cn
where nv.MaNV=cn.MaNV
group by nv.MaNV
having count(distinct cn.MaMB)>3 

---Câu 6:  Với mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi công đó có thể lái---
select nv.MaNV, count(distinct MaMB) as 'Số loại máy bay lái được'
from NHANVIEN nv, CHUNGNHAN cn
where nv.MaNV=cn.MaNV
group by nv.MaNV


---Truy vấn lồng---

---Câu 7: Cho biết mã số của CÁC nhân viên có lương cao nhất---
select  MaNV
from NHANVIEN
where luong in (
							select top 3 max(luong)
							from NHANVIEN
							group by luong
							order by luong desc) /* tìm ra top 3 nhân viên có lương cao nhất*/
order by luong desc /* sắp sếp thứ tự từ 3 người có lương cao nhất */
--- Câu 8: Cho biết tên các phi công có lương nhỏ hơn chi phí thấp nhất của đường bay từ sài gòn đến buôn ma thuột---
select Ten
from  nhanvien
where luong < (
							select min(chiphi)
							from chuyenbay
							where GaDi = 'SGN' and GaDen='BMV') /* tìm chi phí thấp nhất */
--- Câu 9: Cho biết tên các phi công lái ít nhất 3 loại máy bay và có tầm bay xa hơn 3200km---
select ten
from NHANVIEN nv, CHUNGNHAN cn, MAYBAY mb
where nv.MaNV = cn.MaNV  and mb.MaMB=cn.MaMB and tambay>3200
group by ten
having count(distinct mb.mamb) >=3 and exists
														 (select count(distinct mb.MaMB) 
														 from maybay mb, CHUNGNHAN cn 
														 where mb.MaMB=cn.MaMB 
														 group by mb.MaMB, TamBay
														 having tambay>3200)



--- Exists và các dạng khác---
--- Câu 10: Tìm các phi công có thể lái tất cả các loại máy bay boeing---
select nv.MaNV, Ten
from NHANVIEN nv, CHUNGNHAN cn
where nv.MaNV=cn.MaNV and MaMB>700
group by nv.MaNV, Ten
having count(distinct cn.MaMB) >=  (select count(distinct cn.MaMB)
					from CHUNGNHAN cn, MAYBAY mb
					where cn.MaMB= mb.MaMB and mb.MaMB >700 ) /* tìm ra số máy bay boeing để so sánh với số máy bay phi công lái được mà có mã lớn hơn 700 */





