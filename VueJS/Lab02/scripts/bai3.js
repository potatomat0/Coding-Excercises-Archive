let app = Vue.createApp({
    data:()=>{
       return{
          circum:"",
          area:"",
          length:'',
          width:''
       }
    },
    methods:{
       cal(){
          this.circum = (this.length *2 + this.width*2)
          this.area = this.length *this.width
         return [this.circum,this.area]
       }
    }
 }).mount('#app')