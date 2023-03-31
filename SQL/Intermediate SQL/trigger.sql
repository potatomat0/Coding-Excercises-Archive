--use
use QuanLyDeTaiTotNghiep;
--- câu 1: tạo trigger thỏa mãn điều kiện khi xóa một đè tài sẽ xóa các thông tin liên quan
create trigger tr_cau1 
on detai --bảng mà trigger sẽ ảnh hưởng
instead of delete --sẽ chỉ thực hiện các câu lệnh ở phần thân cho các thao tác xóa
as
begin
	--khai báo biến @msdt
	declare @msdt char(6) 
	if not exists (select * from detai where msdt = (select msdt from deleted))
	print N'hình như là đề tài ko tồn tại á bạn'
	else
		begin
		--xóa msdt từ các cột tham chiếm
		select @msdt = (select msdt from deleted)
		delete from gv_hddt where msdt = @msdt
		delete from SV_DETAI where msdt = @msdt
		delete from hoidong_dt where msdt = @msdt
		delete from gv_uvdt where msdt = @msdt
		delete from gv_pbdt where msdt = @msdt
		delete from detai where msdt = @msdt
		print N'đã xóa đề tài thành công'
		end
end
delete from detai where msdt = 97008
insert into detai values (97008, N'chọc chó')
select * from DETAI
sp_columns detai

----câu 2: Tạo trigger thỏa mãn điều kiện khi xóa một sinh viên sẽ xóa các thông tin liên quan.
create trigger tr_cau2
on sinhvien
instead of delete 
as
begin
	declare @mssv char(6)
	if not exists (select * from sinhvien where mssv =(select mssv from deleted))
	print N'ko co'
	else 
		begin
		select @mssv = (select mssv from deleted)
		delete from SV_DETAI
		delete from sinhvien where mssv = @mssv
		end
end
select * from SINHVIEN
insert into SINHVIEN values ('97TH07',N'Johnny Sins',33821230, '97TH02', N'A me ri cà')
delete from SINHVIEN where mssv = '97TH07'
---câu 3: Tạo trigger thỏa mãn điều kiện khi xóa một hội đồng sẽ xóa các thông tin liên quan.
alter trigger tr_cau3
on hoidong
instead of delete
as
begin
	declare @mshd smallint
	select @mshd = mshd from deleted
	if not exists (select * from hoidong where MSHD = @mshd)
	print N'không có hội đồng này đâu bạn'
	else
		begin
			delete from hoidong_dt where MSHD=@mshd
			delete from HOIDONG_GV where MSHD=@mshd
			delete from hoidong where mshd = @mshd
			print N'Đã xóa hội đồng rồi nè'
		end
end
--câu 4: Tạo trigger thỏa mãn ràng buộc là khi đổi một mã số đề tài (MSDT) sẽ thay đổi các thông tin liên quan.
alter trigger tr_cau4
on detai for update as
begin
	declare @msdt char(6) 
	select @msdt = msdt from inserted
	declare @exmsdt char(6)
	select @exmsdt= msdt from deleted
	update GV_PBDT set msdt=@msdt  where msdt = @exmsdt
	update gv_uvdt set msdt=@msdt where msdt = @exmsdt
	update GV_hdDT set msdt=@msdt  where msdt = @exmsdt
	update hoidong_dt set msdt=@msdt  where msdt = @exmsdt
	update SV_DETAI set msdt = @msdt where msdt = @exmsdt
end
--chạy thử trigger 4
	go
	--tạm thời vô hiệu hóa các ràng buộc của các bảng tham chiếu khóa ngoại
	alter table gv_pbdt nocheck constraint all
	alter table gv_uvdt nocheck constraint all
	alter table gv_hddt nocheck constraint all
	alter table hoidong_dt nocheck constraint all
	alter table sv_detai nocheck constraint all
update detai set MSDT = 97009 where msdt = 97008
	--kích kích hoạt lại các ràng buộc
	alter table gv_pbdt check constraint all
	alter table gv_uvdt check constraint all
	alter table gv_hddt check constraint all
	alter table hoidong_dt check constraint all
	alter table sv_detai check constraint all
--Câu 5: Tạo trigger thỏa mãn ràng buộc là khi đổi một mã số giáo viên (MSGV) sẽ thay đổi các thông tin liên quan.
create trigger tr_cau5
on giaovien for update as 
begin
	declare @msgv_new char(6) 
	select @msgv_new = msgv from inserted
	declare @msgv_old char(6) 
	select @msgv_old= msgv from deleted
	update GV_HV_CN set msgv = @msgv_new where msgv = @msgv_old
	update GV_HDDT set msgv = @msgv_new where msgv = @msgv_old
	update GV_PBDT set msgv = @msgv_new where msgv = @msgv_old
	update gv_uvdt set msgv = @msgv_new where msgv = @msgv_old
	update hoidong set msgvthd= @msgv_new where msgvthd = @msgv_old
	update HOIDONG_GV set msgv = @msgv_new where msgv = @msgv_old
end

--chạy thử trigger 5
--tạm thời vô hiệu hóa các ràng buộc của các bảng tham chiếu khóa ngoại
	alter table gv_hv_cn nocheck constraint all
	alter table gv_pbdt nocheck constraint all
	alter table gv_hddt nocheck constraint all
	alter table hoidong nocheck constraint all
	alter table hoidong_gv nocheck constraint all
	alter table gv_uvdt nocheck constraint all
	alter table giaovien nocheck constraint all
update detai set MSDT = 97009 where msdt = 97008
	--kích kích hoạt lại các ràng buộc
	alter table gv_pbdt check constraint all
	alter table gv_uvdt check constraint all
	alter table gv_hddt check constraint all
	alter table hoidong_dt check constraint all
	alter table sv_detai check constraint all




