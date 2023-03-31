--  Câu 1: Ứng với mỗi để tài cho biết  Tên đề tài, tên sinh viên tham gia, tên giáo viên hướng dẫn, tên giáo viên phản biện.
--tạo view 1 có tên đề tài và tên sinh viên
alter view v_cau1_1
as select tendt, tensv, detai.MSDT dt
from detai, sinhvien, SV_DETAI
where detai.MSDT=SV_DETAI.MSDT and SINHVIEN.MSSV=SV_DETAI.mssv
--tạo view 2 có tên giáo viên hướng dẫn
alter view v_cau1_2
as select TENGV hd, msdt
from GV_HDDT, giaovien 
where giaovien.MSGv=gv_hddt.msgv
--tạo view 3 có tên giáo viên phản biện
alter view v_cau1_3
as select TENGV pb, msdt
from GV_PBDT, giaovien
where giaovien.MSGV=GV_PBDT.msgv
--tạo view 4 hợp cả 3 view thành 1
alter view v_cau1
as select tensv, tendt, hd, pb
from v_cau1_1,v_cau1_2,v_cau1_3
where v_cau1_1.dt = v_cau1_2.msdt and v_cau1_1.dt=v_cau1_3.msdt

--truy vấn view câu 1: 
select*from v_cau1

--câu 2: Ứng với mỗi giáo viên, cho biết tên đề tài hướng dẫn
create view v_cau2
as select tengv as N'Tên giáo viên', TENDT as N'Tên đề tài'
from giaovien gv, detai dt, GV_HDDT
where dt.MSDT=GV_HDDT.MSDT and gv.MSGV=GV_HDDT.msgv

select * from v_cau2
/* query designer */
--câu 3:
create view v_cau3
as select tengv as N'Tên giáo viên', TENDT as N'Tên đề tài'
from giaovien gv, detai dt, GV_pbdt
where dt.MSDT=GV_pbdt.MSDT and gv.MSGV=GV_pbdt.msgv

select*from v_cau3

