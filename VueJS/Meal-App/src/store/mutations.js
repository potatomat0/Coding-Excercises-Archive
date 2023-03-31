// hàm tạo mảng sản phẩm, nếu có tồn tại thì két quả sẽ bằng meals
// nếu không tồn tại thì trả về mảng rỗng
export function setSearchedMeals(state, meals) {
  state.searchedMeals = meals || []
}
export function setMealsByLetter(state, meals) {
  state.mealsByLetter = meals || []
}
export function setMealsByIngredients(state, meals) {
  state.mealsByIngredient = meals || []
}
export function setIngredient(state, ingredient) {
  state.ingredient = ingredient
}