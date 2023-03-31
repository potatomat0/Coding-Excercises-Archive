---cursors---
--- thêm 2 cột vào sv_detai
Alter table sv_detai
Add diem_tb float, xeploai nvarchar(20) go
--- tạo cursor
Declare tbc cursor for select msdt from detai
open tbc
Declare @msdt char(6), @hd float, @pb float, @uv float, @dtb nvarchar(30), @tbc float, @xeploai nvarchar(10)

Fetch next from tbc into @msdt

While @@fetch_status =0

Begin
	Select @hd=diem from gv_hddt where msdt=@msdt
	select @pb= diem from 	gv_pbdt where msdt=@msdt 
	Select @uv=sum( diem )from 	gv_uvdt where msdt=@msdt

	set  @tbc=(@hd+@pb+@uv)/5 
	
set @xeploai=case 
When @tbc >=9 then 'gioi'
when @tbc between 7 and 9 then  'kha'
When @tbc between 5 and 7 then 'trung binh'
When @tbc <5 then 'yeu' end
	
update sv_detai set diem_tb=@tbc, 	xeploai=@xeploai where msdt=@msdt
		
Fetch next from tbc into @msdt
End

Close tbc
Deallocate tbc


---câu 2:
--Thêm cột số lượng:
alter table detai add soluong int 
--tạo cursor:
Declare z cursor for 
//kết hai bảng detai với sv_detai
Select detai.MSDT, count(detai.mssv) as N’Số sinh viên’ 
from detai left outer join  sv_detai on detai.msdt=sv_detai.msdt
Group by detai.msdt

Open z
Declare @msdt char(6), @mssv int
Fectch next from z into @msdt, @mssv
while @@fetch_status = 0
	Begin
		Update detai set 						soluong=@mssv where 			msdt=@msdt
		Fetch next form z into 
		@msdt, @mssv
	End
Close z
Deallocate z
Go


