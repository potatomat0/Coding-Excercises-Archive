let app = Vue.createApp({
          data: () => {
                    return { img : "img1",
                             name : "john doe",
                             birth : "03/07/2003",
                             gender : "Nam",
                             point : 4.9
                    }

          },
}).mount("#app")