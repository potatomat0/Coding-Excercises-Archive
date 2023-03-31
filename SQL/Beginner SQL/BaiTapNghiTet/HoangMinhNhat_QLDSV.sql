use HMN_QLDSV;
---7.1: Cho biết sv chưa thi môn csdl---
Select *
from Dmsv
where MaSv not in (
								select k.masv
								from dmmh m, ketqua k
								where m.MAMH=k.MAMH and TENMH=N'Cơ sở dữ liệu')
---7.2: Cho biết sv không thi lần 1 mà có thi lần 2---
Select s.masv, HOSV, TENSV
from ketqua kq, DMSV s
where  s.masv = kq.masv and lanthi=2 and kq.MASV not in (
													select masv
													from ketqua
													where lanthi =1)
---7.3: Cho biết môn nào không có sinh viên khoa anh văn học---
Select*
from dmmh
where mamh not in (
								select mamh
								from ketqua kq, dmsv sv
								where kq.MASV = sv.MASV and makh='av')
---7.4: Cho biết những sv khoa anh văn chưa học môn văn phạm---
select *
from dmsv
where makh='av' and masv not in (
								select distinct masv
								from ketqua
								where MAMH=5)
---7.5: Cho biết những môn không có sv khoa av rớt---
select * 
from dmmh
where mamh  in (
									select mamh
									from ketqua kq, dmsv sv
									where sv.masv=kq.masv and diem>=5 and makh='av')
---7.6: Cho biết những khoa không có sv nữ---
select*
from dmkhoa
where makhoa not in (
									select makh 
									from DMSV
									where PHAI=N'Nữ')
---7.7: Cho biết những sv học khoa anh văn có học bổng hoặc chưa bao giờ rớt---
select *
from dmsv
where (hocbong>0 and makh='av') or masv not in (
																					select masv
																					from ketqua
																					where diem<5)
---7.8: Cho biết những sv không có học bổng hoặc bị rớt môn học---
select *
from dmsv
where hocbong=0 or masv in (
													select masv
													from ketqua
													where (lanthi=1 and diem<5) and (lanthi=2 and diem<5))
---Truy vấn dùng phép chia---
---8.1: Cho biết môn được tât cả các sinh viên theo học---
select *
from dmmh k1
where not exists (select*from dmsv s
							where not exists (
														select*
														from ketqua k2
														where k2.masv=s.MASV
														and k2.mamh=k1.mamh))
---8.2: Cho biết những sv học những môn giống siên viên có mã số a02 học---
Select distinct MaSV
From ketqua kq
Where exists(
					select distinct MaMH
					From KetQua									
					Where MaSV='A02' and MaMH=kq.MaMH
				)
---8.3: cho biết những sv học những môn bằng đúng những môn mà sv a02 học---
/* câu này khó quá nên em không thực sự hiểu hết sau khi làm :( */
Select TenSV
from KetQua kq,DMSv dmsv,(select MaSV,MaMH,count(distinct MaMH)SoMon
												from KetQua									
												where MaSV='A02'
												group By MaSV,MaMH)a
where kq.MaSV=dmsv.MASV and kq.MAMH=a.MAMH and kq.MASV <>a .MaSV
group by TenSV
having count(distinct kq.MaMH)=(select count(distinct MaMH)
														from KetQua									
														where MaSV='A02')

--- kết ngoài---

---9.1: với mỗi môn học cho biết bao nhiêu sv đã học môn học đó---
Select h.mamh, tenmh, count(distinct masv) as N'Số sinh viên'
from dmmh h left outer join ketqua k on h.mamh = k.mamh
group by h.mamh, tenmh
---9.2: Với mỗi sv cho biết đã thi lại lần 2 bao nhiêu lần---
select s.masv,hosv, tensv, count(lanthi) as N'Lần thi'
from dmsv s left outer join ketqua k on s.masv=k.masv
where lanthi=2
group by s.masv, hosv, tensv
---9.3: với mỗi môn học cho biết bao nhiêu sv đã dự thi lần 2---
select m.mamh, TENMH, count(lanthi) as N'Lần thi'
from dmmh m left outer join ketqua k on m.mamh=k.MAMH
where lanthi=2
group by m.mamh, tenmh
---9.4: với mỗi môn học cho biết bao nhiêu sv đã thi lần 1 đậu---
select m.MAMH, tenmh, count( masv) as N'Lần thi'
from dmmh m left outer join ketqua k on m.mamh=k.mamh
where lanthi=1 and diem>5
group by m.mamh, m.tenmh
---9.5:  với mỗi sv cho biết bao nhiêu lần không thi lần 1 mà có thi lần 2---
select masv
from ketqua kq
where lanthi=2 and not exists
		(select *
		from ketqua)

---Thực hiện insert update delete---

---10.1: Tạo một bảng mới tên sinhvien-ketqua: gồm MASV, HOSV, TENSV, SoMonHoc. Sau đó thêm dữ liệu vào bảng này dựa vào dữ liệu đã có---
Create Table SinhVien_KetQua(
	MaSV char(3) not null,
	HoSV nvarchar(15) not null,
	TenSV nvarchar(7)not null,
	SoMonHoc tinyint)

Insert Into SinhVien_KetQua
Select dmsv.MaSV,HoSV,TenSV,count(distinct MaMH)
	From DMSV dmsv,KetQua kq
	Where dmsv.MaSV=kq.MaSV
	Group By dmsv.MaSV,HoSV,TenSV
---10.2: Thêm vào bảng khoa cột siso, lần lượt cập nhật sỉ số vào khoa từ dữ liệu sinh viên---
alter table dmkhoa
add siso tinyint

update DMKHOA
set siso=(select count(*)
						from dmsv
						where makhoa='av')
where makhoa='av'

update DMKHOA
set siso=(select count(*)
						from dmsv
						where makhoa='th')
where makhoa='th'

update DMKHOA
set siso=(select count(*)
						from dmsv
						where makhoa='tr')
where makhoa='tr'

update DMKHOA
set siso=(select count(*)
						from dmsv
						where makhoa='vl')
where makhoa='vl'

---10.3: Thiết lập học bổng bằng 0 cho những sinh viên thi hai môn rớt ở lần 1---
update dmsv
set hocbong=0
where masv  in (select masv
							from ketqua
							where lanthi=1 and diem<5
							group by masv
							having count(mamh)=2
						)
---10.4: Tăng thêm 1 điểm cho các sinh viên rớt lần 2. Nhưng chỉ tăng tối đa 5 điểm---
update ketqua
set diem= diem+1
where lanthi=2 and diem+1<=5
---10.5: Tăng học bổng thêm 100k cho sinh viên có tất cả điểm thi >=7---
update dmsv
set hocbong=hocbong+ 100000
where masv in  (select masv
							from ketqua
							group by masv
							having avg(diem)>=7)
---10.6: Xóa tất cả những sinnh viên chưa dự thi môn nào---
Delete from dmsv
where masv not in (select distinct masv from ketqua)
----10.7: xóa tât cả những môn mà không có sinh viên học---
delete from dmmh
where mamh not in (select distinct mamh from ketqua)
								














