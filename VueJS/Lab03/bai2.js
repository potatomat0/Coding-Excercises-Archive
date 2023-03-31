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
        ],
      };
    },
    methods: {
      formatPrice(value) {
        let val = value.toFixed(2);
        return val.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ".");
      },

      formatDate(value) {
        if (value) {
          let date = new Date(value);
          const months = [
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December",
          ];

          
          let month = months[date.getMonth()];

          return (
            month+
            "-" +
            date.getDate() +
            "," +
            date.getFullYear()
          );
        }
      },
    },

    computed: {},

    filters: {},
  });

  app.mount("#app");