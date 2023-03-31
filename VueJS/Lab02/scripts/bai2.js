let id = 1;
let app = Vue.createApp({
   data:()=>{
      return{
         hanghoa:[
            {name:'Iphone 9',price:700,id: id++,stt:false,check:false,quantity :0,total:0},
            {name:'Samsung',price:400,id: id++,stt:false,check:false,quantity :0,total:0},
            {name:'Nokia',price:100,id: id++,stt:false,check:false,quantity :0,total:0},
            {name:'Sony Xperia',price:450,id: id++,stt:false,check:false,quantity :0,total:0},
            {name:'Motorola',price:180,id: id++,stt:false,check:false,quantity :0,total:0},
            {name:'Oppo',price:600,id: id++,stt:false,check:false,quantity :0,total:0},
            {name:'bPhone',price:90,id: id++,stt:false,check:false,quantity :0,total:0},
         ],
         select : 'Mức giá',
      }
   },
  methods:{
   selectAll(){
      this.hanghoa.forEach(x=>{
          return [x.stt = !x.stt,x.check = !x.check]
      })
   },
   },
   computed:{
      filter(){
         return this.hanghoa.filter(item =>{
            if(this.select == "Mức giá"){
               return item
            }
            else if(this.select=="Dưới 200"){
               return item.price < 200
            }
            else if(this.select == "Từ 200 đến 500"){
               return item.price>=200 && item.price<=500
            }
            else{
               return item.price>500
            }
         })
      },
      sumTotal(){
   let tong = 0
   this.hanghoa.forEach(item =>{tong+= item.price * item.quantity
   })
   return tong
      }
   }
}).mount('#app')