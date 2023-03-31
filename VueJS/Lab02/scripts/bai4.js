   let app = Vue.createApp({
      data:()=>{
         return{
           nsx:'',
           ten:'',
           sl:'',
           stt:'',
           check:[],
           err:[
            {
               nsx:'',
               ten:'',
               sl:'',
               stt:'',
               check:''
            }

           ]
         }
      },
      methods:{
         cal(){
            if(!this.ten){
               this.err.ten = "Vui lòng nhập tên sản phẩm"
            }
            else{
               this.err.ten = ""
            }
            if(!this.sl){
               this.err.sl = "Vui lòng nhập số lượng"
            }
            else if(isNaN(this.sl)){
               this.err.sl = "số lượng không được là chữ cái"
            }
            else{
               this.err.sl = ""
            }
            if(!this.nsx){
               this.err.nsx = "Vui lòng chọn nhà sản xuất"
            }
            else{
               this.err.nsx = ""
            }
            if(!this.stt){
               this.err.stt = "Hàng cũ hay mới"
            }
            else{
               this.err.stt = ""
            }
            if(this.check.length == 0){
               this.err.check = "Màu gì"
            }
            else{
               this.err.check = ""
            }
            console.log(this.check);
         }
      }
   }).mount('#app')