let app = Vue.createApp({
       data : ()=>{
                 return {
                           img : [
                                     {img : "https://is2-ssl.mzstatic.com/image/thumb/Music/42/b2/99/mzi.mxbqgebj.jpg/486x486bb.png",
                                     name : "Damnation"},
                                     {img : "https://is2-ssl.mzstatic.com/image/thumb/Music128/v4/13/9b/25/139b2533-d5f3-7a5b-3857-6f6d1ce2c341/00602557276398.rgb.jpg/1200x1200bf-60.jpg",
                                     name : "Orchid"},
                                     {img : "https://is1-ssl.mzstatic.com/image/thumb/Music128/v4/16/e3/2d/16e32ddd-32b0-f0a0-91aa-c847a1094df5/00602567908678.rgb.jpg/1200x1200bf-60.jpg",
                                     name : "Long season"},
                                     {img : "https://i.scdn.co/image/ab67616d0000b2730a7e017bb5db1c5ae85cabad",
                                     name : "Ex military"},
                                     {img : "https://lastfm.freetls.fastly.net/i/u/ar0/029299e78be8dfbb1d8749323059fdf3.jpg",
                                     name : "Kayo Dot"},
                                    
                           ],
                           class : true ,
                           active : true,
                           searchData : ""
                 }
       },
       computed:{
         search(){
                   return this.img.filter(item => 
                        item.name.toLowerCase().includes(this.searchData.toLowerCase())
                     )
                  }
       }
       
}).mount("#app")