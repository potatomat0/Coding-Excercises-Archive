use HMN_QLDSV;
---3.1: Cho biết tổng số sinh viên của toàn trường---
Select count (* )as tong_sinh_vien
From DMSV
---Cau 3.2: cho biết tổng số sinh viên và tổng số sinh viên nữ---
select tong_sinh_vien=count(masv),tong_sinh_vien_nu=sum(case phai when N'nữ'then 1 else 0 end)
from dmsv
---Câu 3.3: Cho biết tổng số sinh viên của từng khoa---
select makh, TENKHOA, count(Masv) as N'Số SV'
from dmsv sv , dmkhoa k
where MAKH = MAKHOA
group by MAKH, TENKHOA
---Câu 3.4: Cho biết số lượng sinh viên học từng môn---
select TENMH N'Tên môn học', N'Số sinh viên' =count(distinct masv)
from KETQUA kq ,DMMH mh
where kq.MAMH=mh.MAMH
group by TENMH
--- Câu 3.5: Cho biết số lượng môn học mà sv đã học---
select N'Tổng số môn học ' =count(distinct MAMH)
from ketqua
--- Câu 3.6: Cho biết học bổng cao nhất của mỗi khoa---
select makh 'Mã khoa' , N'Học bổng cao nhất' =max(hocbong)
from dmsv
group by makh
---Câu 3.7: Cho biết tổng số sinh viên nam và tổng số sv nữ của mỗi khoa---
select makh,N'Tổng sv nam'=sum(case phai when N'nam'then 1 else 0 end),
'Tổng sv nữ'=sum(case phai when N'nữ'then 1 else 0 end)
from dmsv
group by makh
-- Câu 3.8: Cho biết số lượng sinh viên theo từng độ tuổi---
select N'Tuổi' = year(getdate())-year(ngaysinh) ,  N'Số sinh viên'= count(masv)
from dmsv
group by year(getdate())-year(ngaysinh)
--- 3.9: Cho biết số lượng sinh viên đậu và rớt của từng môn trong lần thi 1---
select tenmh  as N'Tên môn học', 'Số sv đậu'=sum(case when diem>=5 then 1 else 0 end ),
'Số sv rớt'=sum(case when diem<5 then 1 else 0 end )
from KETQUA kq, DMMH mh
where kq.MAMH=mh.MAMH and LANTHI=1
group by TENMH
--- 4.1: cho biết những năm sinh nào có 2 sv học tại trường---
select year(NGAYSINH) as N'Năm'
from DMSV
group by year(NGAYSINH)
having count(MASV)=2
--- 4.2: Cho biết những nơi nào có hơn 2 sv học tại trường---
select NOISINH, count(MASV)'Số sinh viên'
from DMSV
group by NOISINH
having count(MASV)>=2
---4.3: Cho biết những môn nào có trên 3 sv dự thi---
select TENMH , N'Số sv' = count( distinct MASV)
from KETQUA kq , DMMH mh
where kq.MAMH=mh.MAMH
group by kq.MAMH, TENMH
having count( distinct MASV) >=3
---4.4: Cho biết những sv thi lại trên 2 lần---
select sv.MASV as 'Mã sinh viên', 'Số lần thi lại' = count(LANTHI)
from dmsv sv, KETQUA kq
where sv.MASV = kq.MASV
group by sv.masv, LANTHI
having count(LANTHI) >= 2
---4.5: Cho biết những sv nam có điểm trung bình lần một trên 7.0---
select HOSV,TENSV, PHAI, 'Điểm trung bình' = avg(diem)
from dmsv sv, ketqua kq
where sv.masv = kq.masv and lanthi = 1 and PHAI like 'Nam'
group by sv.masv, phai, HOSV, TENSV
having  avg(diem) >7 
--- 4.6: cho biết danh sách các sv rớt trên 2 môn ở lần thi 1---
select masv 'Mã sv', 'Số môn rớt' = count(mamh)
from ketqua
where lanthi=1 and diem<5
group by masv
having count(mamh)>=2
--- 4.7: Cho biết những khoa có nhiều hơn 2 sv nam---
select makh N'Mã khoa', N'Số sinh viên nam'=count(masv)
from dmsv
where phai='Nam'
group by makh
having count(masv)>=1 ---1 sv cho có kết quả---
--- 4.8: Cho biết những khoa có 2 sv đạt học bổng từ 200k đến 300k---
select TENKHOA as N'Tên khoa'
from DMKHOA kh, DMSV sv
where sv.MAKH = kh.MAKHOA and  HOCBONG between 200000 and 300000
group by TENKHOA
having count(masv) =2
---4.9:  Cho biết những sv nam học 3 môn trở lên---
select sv.MASV, HOSV, TENSV
from dmsv sv, KETQUA kq
where sv.MASV = kq.MASV and PHAI like 'Nam'
group by sv.MASV, HOSV, TENSV
having count( distinct diem) >= 3
---5.1: cho biết sinh viên nào có học bổng cao nhất---
select hosv+' '+tensv  as N'Họ tên sinh viên', hocbong
from dmsv
where hocbong=(select max(hocbong) from dmsv)
---5.2: Cho biết sv nào có điểm thi lần 1 môn csdl cao nhất---
select hosv+' '+tensv 'Họ tên', diem
from ketqua kq,dmmh mh,dmsv sv
where sv.masv=kq.masv  and kq.mamh=mh.mamh and lanthi=1 and tenmh=N'cơ sở dữ liệu'
and diem=
					(
					select max(diem)
					from ketqua kq,dmmh mh
					where kq.mamh=mh.mamh and tenmh=N'cơ sở dữ liệu' and lanthi=1
					)
---5.3: cho biết sv khoa anh văn có điểm lớn nhất---
select hosv+' '+tensv 'Họ tên' 
from dmsv
where (getdate()-ngaysinh)=
												(
												select max(getdate()-ngaysinh)
												from dmsv
												where makh='av'
												)
---5.4:  cho biết khoa nào đông sv nhất---
select tenkhoa
from dmsv sv,dmkhoa kh
where sv.makh=kh.makhoa
group by tenkhoa
having count(tenkhoa)>=all(
												select count(masv)
												from dmsv
												group by makh)
---5.5: Cho biết khoa nào có đông nữ nhất---
Select TENKHOA
from dmsv sv, dmkhoa kh
where sv.MAKH = kh.MAKHOA and PHAI = N'Nữ'
group by TENKHOA
having count(masv) >= all 
											(select count(masv)
											from dmsv
											where PHAI = N'Nữ'
											group by makh)
---5.7:  cho biết môn nào có nhiều sv rớt lần 1 nhất---
select TENMH
from ketqua kq,dmmh mh
where kq.MAMH = mh.MAMH and LANTHI=1 and diem<5
group by TENMH
having count(diem)>=all (
											select count(diem)
											from ketqua
											where lanthi=1 and diem<5
											group by mamh)
---5.6: cho biết sinh viên khoa anh văn học môn văn phạm có điểm thi lần 1 thấp nhất---
select HOSV, TENSV, DIEM
from DMSV sv, KETQUA kq, DMMH mh
where sv.MASV=kq.MASV and TENMH = N'Văn phạm' and LANTHI =1
group by HOSV, TENSV, DIEM
having diem = (
						select min(diem)
						from KETQUA
						where LANTHI=1
						)
---5.8:  Cho biết sv thi lần 2 csdl bằng điểm với sv A01 thi lần 1 csdl---
select hosv, tensv,diem
from dmsv sv, ketqua kq
where sv.masv=kq.masv and lanthi = 2 and mamh = 1
group by hosv, tensv,diem
having diem = (
						select diem
						from ketqua
						where masv= 'A01' and lanthi=1 and mamh=1)
---5.9: Cho sv không học khoa anh văn có điểm thi môn văn phạm lớn hơn điểm thi văn phạm của sinh viên học khoa anh văn---
select HOSV, TENSV, sv.MASV, diem
from dmsv sv, ketqua kq
where sv.masv = kq.MASV and mamh = 5 and makh not like 'AV'
and diem = (
							select max(diem)
							from dmsv sv, ketqua kq
							where sv.masv=kq.masv and mamh = 5 and makh = 'AV')
--- 6.1: Cho biết sv có nơi sinh cùng với Hải---
select masv, hosv + ' ' + TENSV as N'Tên sv'
from dmsv
where noisinh=(
							select noisinh
							from dmsv
							where tensv= N'Hải')
---6.2:  Cho biết những sv có học bổng lớn hơn tất cả học bổng cả sinh viên thuộc khoa anh văn---
select masv, hosv, tensv
from dmsv 
where HOCBONG>all (
										select hocbong 
										from dmsv 
										where makh='av')
---6.3: Cho biết nữa sv có học bổng lớn hơn bất kỳ học bổng của sv học khóa av---
select masv, hosv, tensv
from dmsv 
where HOCBONG>any (
										select hocbong 
										from dmsv 
										where makh='av')
---6.4: Cho biết sv có điểm thi môn csdl lần 2 lớn hơn tất cả điểm thi lần 1 môn csdl của all sv khác---
select sv.masv, hosv, tensv
from dmsv sv, ketqua kq
where sv.masv = kq.MASV and lanthi=2  and MAMH='1' and diem> all
																											 (select diem 
																											 from ketqua 
																											 where LANTHI=1 and mamh=1)
---6.5: Cho biết những sinh viên đạt điểm cao nhất trong từng môn---
select masv,ketqua.mamh,diem
from ketqua, 
					(select mamh, max(diem) as maxdiem
					from ketqua
					group by mamh)m
where ketqua.mamh=m.mamh and diem=m.maxdiem
---6.6: Cho biết môn nào có nhiều sv học nhất---
select mh.MAMH,TENMH
from ketqua kq, DMMH mh
where mh.mamh=kq.mamh
group by mh.mamh, tenmh
having count(distinct masv)>= all  
													(select count(distinct masv) as 'so sv'
													from ketqua
													group by MAMH )
---6.7: Cho biết những khoa có đông sv nam học nhất---
select tenkhoa
from dmsv sv, dmkhoa kh
where sv.makh = kh.makhoa and PHAI='Nam'
group by tenkhoa
having count(masv)>= all (
											select count(masv)
											from dmsv
											where phai='Nam'
											group by makh)
---Câu 6.8: Cho biết khoa nào có nhiều sv nhận học bổng nhất---
select tenkhoa
from dmsv sv, dmkhoa kh
where sv.makh = kh.makhoa and hocbong>0
group by tenkhoa
having count(masv)>= all (
											select count(masv)
											from dmsv
											where hocbong>0
											group by makh)
---Câu 6.9: Cho biết khoa nào có đông sv nhận học bổng nhất và khoa nào có ít sv nhận học bổng nhất---
Select makh,count(MaSV)'Số sv'
From DMSV
Where HocBong>0
Group By makh
Having count(MaSV)>=All (Select count(MaSV)
											From dmsv
											where hocbong>0
											Group By makh
)
UNION
Select makh,count(MaSV)'Số sinh viên'
From dmsv
Where hocbong>0
Group By makh
Having count(MaSV)<=all (Select count(MaSV)
												From DMSV
												where hocbong>0
												Group By makh
												)
order by count(masv) desc

---6.10: Cho biết 3 sinh viên có học nhiều môn nhất---
select top 3 sv.masv, hosv, tensv, count(distinct mamh) as N'Số môn'
from dmsv sv , ketqua kq
where sv.masv = kq.masv
group by sv.masv, hosv, tensv
order by count(distinct mamh) desc












