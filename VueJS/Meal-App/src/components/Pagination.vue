<template>
    <div>
      <ul>
        <li v-for="item in displayedItems" :key="item.id">{{ item.name }}</li>
      </ul>
      <pagination :current-page="currentPage" :items-per-page="10" :total-items="items.length" />
    </div>
  </template>
  
  <script>
  import Pagination from './components/pagination.vue'
  
  export default {
    name: 'IngredientApp',
    components: {
      Pagination
    },
    data() {
      return {
        items: [
          { id: 1, name: 'Ingredient 1' },
          { id: 2, name: 'Ingredient 2' },
          // etc.
        ],
        currentPage: 1
      }
    },
    computed: {
      displayedItems() {
        const startIndex = (this.currentPage - 1) * 10
        const endIndex = startIndex + 10
        return this.items.slice(startIndex, endIndex)
      }
    }
  }
  </script>
  