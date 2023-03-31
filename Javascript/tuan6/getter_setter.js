class sinhvien{
    constructor(fname, lname){
        this.fname = fname;
        this.lname = lname;
    }

    get fname(){
        return this.fname;
    }

    get lname(){
        return this.lname;
    }

    get getFullname() {
        return `Tên: ${this.fname} ${this.lname}`;
    }

    set fname(value) {
        this.fname = value;
    }
    set lname(value) {
        this.lname = value;
    }
}

//gọi hàm getFullname, gọi hàm get không cần đóng mở ngoặc
var s = new sinhvien('hoang', 'nhat')
console.log(s.getFullname)

