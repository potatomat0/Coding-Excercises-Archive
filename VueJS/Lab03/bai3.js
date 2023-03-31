  let app = Vue.createApp({
    data: () => {
      return {
        products: [
          {
            name: "aniseed syrup",
            price: 190,
            sales: 0.19,
            date: "2000-3-16",
          },
          {
            name: "change",
            price: 19,
            sales: 0.19,
            date: "1982-12-18",
          },

          { name: "aniseed syrup", price: 10, sales: 0, date: "1973-06-14" },
          {
            name: "chef anton's cajun seasoning",
            price: 22,
            sales: 0,
            date: "1976-03-10",
          },
          {
            name: "chef anton's gombo mix",
            price: 21.35,
            sales: 0,
            date: "1978-06-11",
          },
          {
            name: "grandma's boysenberry spread",
            price: 25,
            sales: 0.03,
            date: "1981-09-03",
          },
          {
            name: "uncle bob's oraganic dried pears",
            price: 30,
            sales: 0.03,
            date: "1983-03-13",
          },

          {
            name: "aniseed syrup1",
            price: 190,
            sales: 0.19,
            date: "2000-3-16",
          },
          {
            name: "change1",
            price: 19,
            sales: 0.19,
            date: "1982-12-18",
          },
          { name: "aniseed syrup", price: 10, sales: 0, date: "1973-06-14" },
          {
            name: "chef anton's cajun seasoning1",
            price: 22,
            sales: 0,
            date: "1976-03-10",
          },
          {
            name: "chef anton's gombo mix1",
            price: 21.35,
            sales: 0,
            date: "1978-06-11",
          },
          {
            name: "grandma's boysenberry spread1",
            price: 25,
            sales: 0.03,
            date: "1981-09-03",
          },
          {
            name: "uncle bob's oraganic dried pears1",
            price: 30,
            sales: 0.03,
            date: "1983-03-13",
          },
        ],
        start: 0,
        end: 5,
       
      };
    },
    methods: {
      next() {
        if (this.end < this.products.length) {
          this.start += 5;
          this.end += 5;
        }
      },
      previous() {
        if (this.start > 0) {
          this.start -= 5;
          this.end -= 5;
        }
      },

      filterPrice(){
        this.products.sort((a,b)=>{
          return a.price-b.price
        })
      },
      filterSales(){ 
        this.products.sort((a,b)=>{
          return a.sales-b.sales
        })
      },

      filterDate(){
        this.products.sort((a,b)=>{
          return a.date-b.date
        })
      }


     

      
    },

    computed: {
      limitTo() {
        return this.products.filter((product, index) => {
          if (index < this.end && index >= this.start) {
            return product;
          }
        });
      },
    },
  });

  app.mount("#app");