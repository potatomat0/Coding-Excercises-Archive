Vue.component('cart-item', {
  props: ['product'], 
  template:` 
  <tr style="margin-bottom: 30px">
    <td> <input type="checkbox"> </td>
    <td> {{product.title}} <td>
    <td> {{product.img}} </td> 
    <td> {{product.price*product.quantity}}đ </td>
    <td> 
      <input class="btn btn-warning p1" min="0" type="button" value="-" v-on:click="decrementQty(product)">
      {{product.quantity}}
      <input class="btn btn-success p1" type="button" value="+" v-on:click="incrementQty(product)">
    </td>
    <td> 
      <button  class="btn btn-danger p1" v-on:click="removeFromCard(product.id)"> x </button>
    </td>
    </tr>
  `,
  methods: {
    removeFromCard(id) {
      store.cart.products = store.cart.products.filter(item => item['id'] !== id)
      store.cart.total = store.cart.products.reduce((acc, item) => acc + item['price']*item['quantity'],0 )

    },
    incrementQty(product) {
      product.quantity++;
      store.cart.total = store.cart.products.reduce((acc, item) => acc + item['price']*item['quantity'],0 )
    },
    decrementQty(product) {
      if(product.quantity>1) product.quantity--
      else alert('Không được chọn số lượng nhỏ hơn 0')
      store.cart.total = store.cart.products.reduce((acc, item) => acc + item['price']*item['quantity'],0 )
    }
  }
});

Vue.component('product-item', {
  props: ['product'],
  template: '#product-item-template',  
  methods: {
    addToCart: function (id) {  
      
      // gán biến sản phẩm với id 
      var product = store.products[id];      
      // if(product.id in list) {
      // //  store.cart.products = store.cart.products.map(item => {if (item['id']==product.id) item['quantity']++;})
      // alert('đã tồn tại'+ product.title)
      // }
      // thêm sản phẩm
      store.cart.products.push(product); 
      
      // update cart
      store.cart.total += product.price;

      
      // thông báo
      alert('Đã thêm ' + product.title + ' vào giỏi hàng');
    },
    
  }
});

var store = new Vue({
  el: '#store',
  data: {
    products: [
      { quantity: 1, id: 0, title: 'Bóng đá', price: 20000, category: 'theThao', img: '⚽' },
      { quantity: 1, id: 1, title: 'Bóng bàn', price: 15000, category: 'theThao', img: '🏓'},
      { quantity: 1, id: 2, title: 'Bóng chuyền', price: 17000, category: 'theThao', img: '🏐' },
      { quantity: 1, id: 3, title: 'Dưa hấu', price: 30000, category: 'traiCay', img: '🍉' },
      { quantity: 1, id: 4, title: 'Táo', price: 40000, category: 'traiCay', img: '🍎' },
      { quantity: 1, id: 5, title: 'Chuối', price: 80000, category: 'traiCay', img: '🍌' },
      { quantity: 1, id: 6, title: 'Giày', price: 100000, category: 'theThao', img: '👟' },
      { quantity: 1, id: 7, title: 'Kiwi', price: 12000, category: 'traiCay', img: '🥝' },
      { quantity: 1, id: 8, title: 'Mũ', price: 17000, category: 'quanAo', img: '👒' },
      { quantity: 1, id: 9, title: 'Ủng', price: 31000, category: 'quanAo', img: '👢'},
      { quantity: 1, id: 10, title: 'Dép', price: 39000, category: 'theThao', img: '🩴' },
      { quantity: 1, id: 11, title: 'Dứa', price: 60000, category: 'traiCay', img: '🍍' },
      { quantity: 1, id: 12, title: 'Đào', price: 18000, category: 'traiCay', img: '🍑' },
      { quantity: 1, id: 13, title: 'Quần dài', price: 10000, category: 'quanAo', img: '👖' },
      { quantity: 1, id: 14, title: 'Áo Trắng', price: 90000, category: 'quanAo', img: '🥼' },
      { quantity: 1, id: 15, title: 'Kính Bơi', price: 120000, category: 'quanAo', img: '🥽' }
    ],
    productsMutate: [
      { quantity: 1, id: 0, title: 'Bóng đá', price: 20000, category: 'theThao', img: '⚽' },
      { quantity: 1, id: 1, title: 'Bóng bàn', price: 15000, category: 'theThao', img: '🏓'},
      { quantity: 1, id: 2, title: 'Bóng chuyền', price: 17000, category: 'theThao', img: '🏐' },
      { quantity: 1, id: 3, title: 'Dưa hấu', price: 30000, category: 'traiCay', img: '🍉' },
      { quantity: 1, id: 4, title: 'Táo', price: 40000, category: 'traiCay', img: '🍎' },
      { quantity: 1, id: 5, title: 'Chuối', price: 80000, category: 'traiCay', img: '🍌' },
      { quantity: 1, id: 6, title: 'Giày', price: 100000, category: 'theThao', img: '👟' },
      { quantity: 1, id: 7, title: 'Kiwi', price: 12000, category: 'traiCay', img: '🥝' },
      { quantity: 1, id: 8, title: 'Mũ', price: 17000, category: 'quanAo', img: '👒' },
      { quantity: 1, id: 9, title: 'Ủng', price: 31000, category: 'quanAo', img: '👢'},
      { quantity: 1, id: 10, title: 'Dép', price: 39000, category: 'theThao', img: '🩴' },
      { quantity: 1, id: 11, title: 'Dứa', price: 60000, category: 'traiCay', img: '🍍' },
      { quantity: 1, id: 12, title: 'Đào', price: 18000, category: 'traiCay', img: '🍑' },
      { quantity: 1, id: 13, title: 'Quần dài', price: 10000, category: 'quanAo', img: '👖' },
      { quantity: 1, id: 14, title: 'Áo Trắng', price: 90000, category: 'quanAo', img: '🥼' },
      { quantity: 1, id: 15, title: 'Kính Bơi', price: 120000, category: 'quanAo', img: '🥽' }
    ],
    filter: false,
    priceFilter : false,
    sortFilter: false,
    cart: {
      string: 'Cart',
      total: 0,
      products: [],
      show: false
    },
  } ,
  methods: {
     // hàm sắp xếp giá tăng dần
     sortedPriceUp: function(arr) {
      // Set slice() to avoid to generate an infinite loop!
      return arr.slice().sort(function(a, b) {
        return a.price - b.price;
      });
  },
     // hàm sắp xếp giá tăng dần
     sortedPriceDown: function(arr) {
      // Set slice() to avoid to generate an infinite loop!
      return arr.slice().sort(function(a, b) {
        return b.price - a.price;
      });
    },
    // filter giá
      // nhỏ hơn 20k
      less20k: function(arr) {
        return arr.filter(item => item['price'] <= 20000)
      },
      // từ 20k đến 50k
      from20kto50k: function(arr) {
        return arr.filter(item => item['price'] >= 20000 && item['price'] <= 50000)
      },
      // từ 50k đến 100k
      from50kto100k: function(arr) {
        return arr.filter(item => item['price'] >= 50000 && item['price'] <= 100000)
      },
      // lớn hơn 100k
      greater100k: function(arr) {
        return arr.filter(item => item['price'] >= 100000)
      },
  }
});