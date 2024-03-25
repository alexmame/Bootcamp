

/*
const array1 = ['🍔', '🌯', '🍮', '🍕', '🍜', '🍞', '🍣', '🥙', '🥩'];

// Ejercicio 1: Encuentra el índice de '🍕'
const indexPizza = array1.indexOf('🍕');

// Utilizamos map para reemplazar los elementos después de '🍕' con '🍺' ademas de crear un array nueva.
const arrayModificado = array1.map((elemento, indice) => indice > indexPizza ? '🍺' : elemento);

console.log(arrayModificado);*/

const array1 = ['🍕','🍕', '🍍', '🍕', '🍕'];
console.log(array1.indexOf('🍍'));
console.log("-------------------------------------------");

const array2 = ['🍕', '🍍', '🍕'];
array2.splice(1, 1); // Elimina 1 elemento empezando desde el índice 1
console.log(array2); // Resultado: ['🍕', '🍕']

console.log("-------------------------------------------");

const array3 = ['🍕', '🍕', '🍍', '🍕', '🍍'];

// Filtrar el array para eliminar las piñas
const nuevoArray = array3.filter(elemento => elemento !== '🍍');

console.log(nuevoArray); // Resultado: ['🍕', '🍕', '🍕']

console.log("-------------------------------------------");
//Ej4

const array4 = ['🍓','🍋', '🍓', '🍋', '🍓'];

// Función para convertir pizzas en setas
const convertirPizzaASeta = (elemento) => {
    return elemento === '🍓' ? '🍄' : elemento;
};

// Utilizamos map para aplicar la función a cada elemento del array
const arrayModificado = array4.map(convertirPizzaASeta);

console.log(arrayModificado); // Resultado: ['🍄', '🍋', '🍄', '🍋', '🍄']

console.log("-------------------------------------------");
//Ej 5
const array5 = ['🌶','🥛', '🌶', '🥛', '🌶', '🥛'];















