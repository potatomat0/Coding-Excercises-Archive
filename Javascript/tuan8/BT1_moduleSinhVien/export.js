//tạo một class sinh viên, gồm các function hiển thị, get set

export class Sinhvien {
    constructor(name = 'Nguyễn Văn A', id='A001') {
        this.name = name;
        this.id= id;
    }

    setName(value) {
        this.name = value;
    }
    setId(value) {
        this.id = value;
    }

    get getName() {
        return this.name
    }
    
    get getName() {
        return this.id
    }

    display() {
        return `name: ${this.name}
        id:  ${this.id}`;
    }
}

// export default Sinhvien;||
