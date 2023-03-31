---cursors---
--Cau 1:Thêm 2 cột vào table SV_DETAI
--- thêm 2 cột vào sv_detai
Alter table sv_detai
Add diem_tb float, xeploai nvarchar(20) go
--- tạo cursor
Declare tbc cursor for select msdt from detai
open tbc
Declare @msdt char(6), @hd float, @pb float, @uv float, @tbc float, @xeploai nvarchar(10)

Fetch next from tbc into @msdt

While @@fetch_status =0 ---vòng lặp while, nếu biến mặc định @@fetch_status có giá trị bằng 0 nghĩa là đã lấy được dữ liệu và sẽ tiếp tục vòng lặp, nếu khác 0 thì vòng lặp dừng

Begin
	Select @hd=diem from gv_hddt where msdt=@msdt
	select @pb= diem from 	gv_pbdt where msdt=@msdt 
	Select @uv=sum( diem )from 	gv_uvdt where msdt=@msdt

	set  @tbc=(@hd+@pb+@uv)/5 
	
	set @xeploai=case 
	When @tbc >=9 then N'Giỏi'
	when @tbc between 7 and 9 then  N'Khá'
	When @tbc between 5 and 7 then N'Trung Bình'
	When @tbc <5 then 'yeu' end
	
	update sv_detai set diem_tb=@tbc, 	xeploai=@xeploai where msdt=@msdt
		
	Fetch next from tbc into @msdt
End
--đóng cursor
Close tbc
Deallocate tbc


---câu 2:
--Thêm cột số lượng:
select*from detai
alter table detai add soluong int 
--tạo cursor:
Declare c_cau2 cursor for 
--kết hai bảng detai với sv_detai
Select detai.MSDT, count(SV_DETAI.MSSV) as N'Số sinh viên'
from detai left outer join  sv_detai on detai.msdt=sv_detai.msdt
Group by detai.msdt

Open c_cau2
Declare @msdt char(6), @mssv char(6)
Fetch next from c_cau2 into @msdt, @mssv
while @@fetch_status = 0
	Begin
		Update detai set 	
		soluong=@mssv where 	
		msdt=@msdt
		Fetch next from c_cau2 into 
		@msdt, @mssv
	End
Close c_cau2
Deallocate c_cau2
Go
 ---Câu 3:
 select*from sv_detai
select*from sinhvien
/* Do sinh viên bảo vệ có thể rớt, nên SV có thể bảo vệ 2, 3 lần
Nếu thêm cột số lần vào 
SINHVIEN(MSSV, TENSV, LOP, SODT, DIACHI, SOLAN)
Dùng cursor để cập nhật lại cột SOLAN */

--tạo cột mới
alter table sinhvien add solan int
---tạo cursor
declare c_cau3 cursor for
select solan, diem_tb, sinhvien.MSSV from sv_detai left join sinhvien on SV_DETAI.MSSV=sinhvien.MSSV
--mở cursor
open c_cau3
declare @solan int, @diem_tb float, @mssv char(6)
fetch next from c_cau3 into @solan, @diem_tb, @mssv
while @@FETCH_STATUS=0 
	begin
			select @solan= solan from sinhvien where mssv = @mssv--mặc định số lần bảo vệ của sinh viên luôn là 3 trước khi họ (có thể) rớt
			if @diem_tb <5--nếu điểm đề tài của sinh viên dưới 5, số lần sẽ còn 2
				set @solan= @solan-1
 			update sinhvien set solan = @solan where mssv=@mssv
			Fetch next from c_cau3 into @solan, @diem_tb, @mssv
	end
--đóng cursor
close c_cau3
deallocate c_cau3






