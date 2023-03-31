let app = Vue.createApp({
  data: () => {
    return {
      id: 1,
      stds: [],
      ten: "",
      ns: "",
      diem: "",
      message:'',
      loai:''
    };
  },
  methods: {
    add() {
      if (this.ten && this.ns && this.diem) {
       if(this.diem<5){
        this.loai = "Yếu/Kém"
       }
       else if(this.diem>8){
        this.loai = "Giỏi/Xuất sắc"
       }
       else{
        this.loai = "Trung bình/Khá"
       }
        this.stds.push({
          id: this.id++,
          ten: this.ten,
          ns: this.ns,
          diem: this.diem,
          loai:this.loai
        });
      }
      else{
        this.message = "Vui long nhap day du thong tin"
      }
      this.neww()
    },
    editTable(x) {
      this.ten = x.ten;
      this.ns = x.ns;
      this.diem = x.diem;
      this.id = x.id;
    },
    saveEdit(x) {
      let num = this.stds[0].id||1;
      this.stds.map((item) => {
        if (x.id == item.id) {
          item.ten = x.ten;
          item.ns = x.ns;
          item.diem = x.diem;
        }
        if(item.id >= num){
          num = item.id
        }
        return { ...item };
      });
      this.ten = "";
      this.ns = "";
      this.diem = "";
      this.id = num+=1
    },
    deleteItem(x) {
       let num = this.stds[0].id || 1;
       this.stds.forEach((item) => {
          if (x.id == item.id) {
             this.stds.splice(this.stds.indexOf(item), 1);
        }
        if(item.id >= num){
          num = item.id+1
        }
      });
      this.ten = "";
      this.ns = "";
      this.diem = "";
      this.id = num;
    },
    cancel(x){
      this.stds.map(item =>{
        let oldName = item.ten
        let oldNS = item.ns
        let oldPoint = item.diem
        if(x.ten != oldName){
          this.ten = oldName
          this.ns = oldNS
          this.diem = oldPoint
        }
      })
    },
    neww(){
      this.ten = "";
      this.ns = "";
      this.diem = "";
    }
  },
}).mount("#app");