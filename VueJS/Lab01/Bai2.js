let app = Vue.createApp({
          data : ()=>{
                    return{
                              productList : [
                                       {name : "Left Rake",
                                        code : "GDN-0011",
                                        available : 1,
                                        price : 19.95,
                                        rating : 3.2,
                                        product : "Leaf rake with 48-inch wooden handle",
                                        img : "img1"
                                       },
                                       {name : "Garden Cart",
                                        code : "GDN-0023",
                                        available : 1,
                                        price : 19.95,
                                        rating : 3.2,
                                        product : "Leaf rake with 48-inch wooden handle",
                                        img : "img2.jpg"
                                       },
                                       {name : "Hammer",
                                        code : "GDN-0011",
                                        available : 1,
                                        price : 19.95,
                                        rating : 3.2,
                                        product : "Leaf rake with 48-inch wooden handle",
                                        img : "img3.jpg"
                                       },
                                       {name : "Saw",
                                        code : "GDN-0011",
                                        available : 1,
                                        price : 19.95,
                                        rating : 3.2,
                                        product : "Leaf rake with 48-inch wooden handle",
                                        img : "img4.jpg"
                                       },
                                       {name : "Video game controller",
                                        code : "GDN-0011",
                                        available : 1,
                                        price : 19.95,
                                        rating : 3.2,
                                        product : "Leaf rake with 48-inch wooden handle",
                                        img : "img1.jpg"
                                       },
                             ]
                    }
          }
}).mount("#app")