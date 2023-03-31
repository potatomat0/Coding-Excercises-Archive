let app = Vue.createApp({
          data: () => {
                    return {

                              orderList: [
                                        {
                                                  name: "Chocolate Freeze",
                                                  price: 60,
                                                   isChosen : false,
                                        }, {
                                                  name: "Phindi Hạnh Nhân",
                                                  price: 50,
                                                   isChosen : false,
                                        }, {
                                                  name: "Cà Phê Sữa",
                                                  price: 40,
                                                   isChosen : false,
                                        }, {
                                                  name: "Trà Sen Vàng",
                                                  price: 30,
                                                   isChosen : false,
                                        },
                              ],
                              sum: 0,
                    }
          },
          methods: {

                    chose(x) {
                             
                              if(x.isChosen == false){
                                        this.sum += x.price
                                        x.isChosen = true
                              }
                              else{
                                        this.sum -= x.price
                                        x.isChosen = false
                              }
                              


                    }
          }
}).mount("#app")