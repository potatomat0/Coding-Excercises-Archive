let app = Vue.createApp({
          data : ()=>{
                    return {
                              img : [
                                        {img : "img1.jpg",
                                        name : "item 1"},
                                        {img : "img2.jpg",
                                        name : "item 2"},
                                        {img : "img3.jpg",
                                        name : "item 3"},
                                        {img : "img4.jpg",
                                        name : "item 4"},
                                       
                              ],
                              classs : true 
                    }
          },
          methods : {
                    grid(){
                              if(this.classs == true){
                                        this.classs = false
                              }
                    },
                    list(){
                            if(this.classs == false){
                              this.classs = true
                            }
                    }
          }
          
}).mount("#app")