const str = 'Learn JavaScript Deeply';
//startsWith()
console.log(str.startsWith('Learn')); // true
console.log(str.startsWith('JavaScript')); // false
console.log(str.startsWith('Deeply', 17)); // tru
//endsWith()
console.log(str.endsWith('Deeply')); // true
console.log(str.endsWith('Learn')); // false
console.log(str.endsWith('JavaScript', 16)); // true
//includes
console.log(str.includes('JavaScript')); // true
console.log(str.includes('Javascript')); // false
console.log(str.includes('PHP')); // false
//repeat
const str1= 'haha';
console.log(str1.repeat(3)); // DeeplyDeeplyDeeply
console.log(str1.repeat(2.5)); // DeeplyDeeply (converts to int)
console.log(str1.repeat(-1)); // RangeError
