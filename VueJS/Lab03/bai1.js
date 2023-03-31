  let app = Vue.createApp({
    data: () => {
      return {
        fullname: "",
        score: "",
        email: "",
        license_plates: "",
        err: "",
        err1: "",
        err2: "",
        err3: "",
      };
    },
    methods: {
         },

    computed: { validate_name() {
        if (this.fullname == "") {
          this.err = "vui lòng nhập họ và tên!";
        } else {
          if (this.fullname.length > 25) {
            this.err = "vui lòng nhập tên không quá 25 ký tự";
          }
          else {
            this.err = "";
          }
        }
      },
      validate_score() {
        if (this.score == "") {
          this.err1 = "vui lòng nhập điểm!";
        } else {
          if (this.score < 0 || this.score > 10) {
            this.err1 = "vui lòng nhập điểm từ 0 đến 10";
          }
          else {
            this.err1 = "";
          }
        }
      },
      validate_email() {
        if (this.email == "") {
          this.err2 = "vui lòng nhập email!";
        } else {
          var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
          if (!this.email.match(mailformat)) {
            this.err2 = "vui lòng nhập đúng định dạng email";
          } else {
            this.err2 = "";
          }
        }
      },

      validate_licensePlates() {
        if (this.license_plates == "") {
          this.err3 = "vui lòng nhập biển số xe!";
        }
        else{
         
            
            if(this.license_plates.slice(0,2)<49 || this.license_plates.slice(0,2)>59 ){
                this.err3="vui lòng nhạp biển số xe sài gòn"

            }
            else if(this.license_plates.slice(5).length<4 ||this.license_plates.slice(5).length<5){
              this.err3="vui lòng nhập phần cuối có 4 hoặc 5 số"
            }
            else{
                this.err3=""

            }
        }
      },
},
  });

  app.mount("#app");