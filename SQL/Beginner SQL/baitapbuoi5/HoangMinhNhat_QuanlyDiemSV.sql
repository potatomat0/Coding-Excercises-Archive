---Thực hành buổi 6---
use HMN_QLDSV;
---Câu 1.1: Liệt kê mã môn học, tên môn học, số tiết của những môn bắt đầu bằng chữ t---
Select MAMH,TENMH,SOTIET
From DMMH
where TENMH like N'T%'
---Câu 1.2: Liệt kê họ tên, ngày sinh, phái của những sv có tên kết thúc bằng chữ i---
Select HOSV+ ' '+TENSV as N'Họ tên',NGAYSINH,PHAI
From DMSV
where TENSV like '%I'
---Câu 1.3: Liệt kê mã khoa và tên khoa của những khoa có tên có ký tự ở vị trí thứ 2 là n---
select MAKHOA,TENKHOA
from DMKHOA
where tenkhoa like '_N%'
---Câu 1.4: liệt kê những sv có họ chứa chữ thị---
Select *
From DMSV
where HOSV like  N'%thị%'
select * from DMSV
---Câu 1.5: liệt kê mã sinh viên, họ tên, phái và học bổng của những sinh viên có tên bắt đầu bằng những chữ cái từ a đến m---
Select MASV,HOSV+' ' + TENSV as N'Họ tên', PHAI, HOCBONG
From DMSV
where TENSV like N'[a-m]%'
---Câu 1.6: liệt kê họ tên, mã khoa và phái của những sinh viên có học bổng trên 150k và sinh ra ở hà nội---
Select HOSV+ ' '+TENSV as N'Họ tên',MAKH,PHAI
from DMSV 
where HOCBONG >= 150000 and  NOISINH like N'Hà Nội'
---Câu 1.7: liệt kê mã sv, mã khoa và phái của những sv có mã khoa là av hoặc vl---
select MASV,MAKH,PHAI
from dmsv
where MAKH in ('AV','VL')
---Câu 1.8: liệt kê mã sinh viên, ngày sinh, nơi sinh và học bổng của những sinh viên sinh từ ngày 1/1/1992 đến 5/6/1993---
select MASV, NGAYSINH,NOISINH,HOCBONG
from dmsv
where NGAYSINH between CONVERT(DATE,'1/1/1992',103) and CONVERT(DATE,'05/06/1993',103)
---Câu 1.9 liệt kê mã sinh viên, ngày sinh, phái và mã khoa của những sinh viên có học bổng từ 80k đến 150k---
select MASV, NGAYSINH,PHAI,MAKH
from dmsv
where HOCBONG between 80000 and 150000
---Câu 1.10: liệt kê mã môn, tên môn và số tiết của những môn có số tiết từ 30 đến 45---
select MAMH,TENMH,SOTIET
from DMMH
where SOTIET between 30 and 45
---Câu 1.11: liệt kê mã sinh viên, họ tên sinh viên, mã khoa và phái của những sinh viên thuộc mã khoa là av hoặc th---
select MASV, HOSV +  ' '+TENSV as N'Họ tên',MAKH,PHAI
from DMSV
where MAKH like 'AV' or MAKH like 'TH'
---Câu 1.12: liệt kê mã sinh viên, họ tên sv, phái và điểm của những sinh viên có điểm cơ sở dữ liệu dưới 5---
select distinct kq.MASV, HOSV, TENSV, PHAI,DIEM
from DMSV sv, KETQUA kq
where kq.MASV=sv.MASV and MAMH like '01' and DIEM<5
select*from DMSV
---Câu 1.13: Liệt kê những sinh viên học khoa anh văn mà không có học bổng, gồm thông tin: mã sinh viên, họ và tên, tên khoa, nơi sinh, học bổng---
select MASV, HOSV +  ' '+TENSV as N'Họ tên', MAKH, NOISINH, HOCBONG
from DMSV
where MAKH like 'AV' and hocbong = 0
select*from dmsv
---Câu 1.14:  query sinh viên có tên bắt đầu từ a đến m, gồm các cột ngày sinh nơi sinh học bổng. sắp xếp tăng dần theo tên---
select MASV, HOSV +  ' '+TENSV as N'Họ tên',NGAYSINH, NOISINH, HOCBONG
from DMSV
where TENSV like N'[a-m]%'
order by TENSV asc
---Câu 1.15: Liệt kê các cột mã sinh viên, họ sinh viên, tên sinh viên, học bổng, ascending theo mã sv---
select MASV, HOSV + ' ' + TENSV as N'Họ tên', HOCBONG
from dmsv
order by masv asc
---Câu 1.16:  Liệt kê các cột họ tên,  phái, ngày sinh, ascending theo phái nam trước nữ sau---
select HOSV + ' ' + TENSV as N'Họ tên',  PHAI, NGAYSINH
from dmsv
order by PHAI desc
---Câu 1.17: Liệt kê cột họ tên sv, ngày sinh, học bổng. Thứ tự tăng dần theo ngày sinh và giảm dần theo học bổng---
select HOSV + ' ' + TENSV as N'Họ tên',  NGAYSINH, HOCBONG
from dmsv
order by NGAYSINH desc, HOCBONG asc
---Câu 1.18: liệt kê cột họ tên, mã khoa và học bổng của những sinh viên có học bổng lớn hơn 100000, desc theo mã khoa---
select HOSV + ' ' + TENSV as N'Họ tên',  MAKH, HOCBONG
from dmsv
where HOCBONG>=100000
order by masv asc
---Câu 2.1: Danh sách sinh viên có nơi sinh ở hà nội và sinh vào tháng 2, gồm cột họ tên sv, nơi sinh, ngày sinh---
select  HOSV + ' ' + TENSV as N'Họ tên', NOISINH,NGAYSINH
from DMSV 
where NOISINH like 'Hà Nội' and month(ngaysinh)=2
---Câu 2.2: Liệt kê họ tên sv, tuổi, học bổng của những sinh viên lớn hơn 20 tuổi---
Select  HOSV + ' ' + TENSV as N'Họ tên', (YEAR(getdate()) - YEAR(ngaysinh)) as Tuoi, HOCBONG
from DMSV 
where (YEAR(getdate()) - YEAR(ngaysinh))>20
---Câu 2.3: Liệt kê họ tên sv, tuổi, tên khoa của những sv có tuổi từ 20 đến 25---
Select  HOSV + ' ' + TENSV as N'Họ tên', (YEAR(getdate()) - YEAR(ngaysinh)) as Tuoi, MAKH
from DMSV 
where (YEAR(getdate()) - YEAR(ngaysinh)) between 20 and 25 /*tầm 29 đến 30 cho có kết quả */
---Câu 2.4: Liệt kê cột họ tên sinh viên, phái, ngày sinh của những sinh viên sinh vào mùa thua năm 1990---
Select  HOSV + ' ' + TENSV as N'Họ tên', PHAI,NGAYSINH
from DMSV 
where datepart(quarter,ngaysinh) = 1 and datepart(year,ngaysinh)=1993
---Câu 2.5: Cho biết thông tin về mức học bổng của các sinh viên, gồm mã sv, phái, mã khoa, mức học bổng, nếu học bổng trên 500k thì là cao còn else thì trung bình---
select MASV,PHAI, MAKH, MucHocBong = Case when HOCBONG>500000 then 'Hoc Bong Cao' else 'Muc trung binh' end
from dmsv
---Câu 2.6: Liệt kê cột họ tên sv, mã môn học, lần thi, điểm, kết quả, nếu điểm nhỏ hơn 5 thì rớt, ngược lại thì đậu---
select HOSV + ' ' + TENSV as N'Họ tên',MAMH, LANTHI, DIEM, KETQUA= case when diem>5 then  N'Đậu' else N'Rớt' end
from KETQUA kq , DMSV sv
where sv.MASV=kq.MASV
order by sv.MASV

























---3.9: Cho biết số lượng sinh viên đậu và số lượng sinh viên rớt của từng môn trong lần thi 1---
select TENMH as N'Tên môn học', 
							sum(case when diem>=5 then 1 else 0 end ) as N'Số sv đậu', /* Nếu điểm trên 5 thì giá trị =1 */
							sum(case when diem<5 then 1 else 0 end ) as N'Số sv rớt'     /* Nếu điểm <= 5 thì giá trị =1*/
from KETQUA kq, DMMH mh
where kq.MAMH=mh.MAMH and lanthi=1
group by TENMH







select tenmh, N'Số sv đậu'=count(masv)
from KETQUA kq, DMMH mh
where kq.MAMH=mh.MAMH and LANTHI=1 and DIEM>=5
group by TENMH










