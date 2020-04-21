/*Flattening
Use the reduce method in combination with the concat method to ¡°flatten¡±
an array of arrays into a single array that has all the elements of the original
arrays.
*/

let arr = [[1,2,3],['a','b','c']];

const flatten = arr.reduce((flat,curr)=>flat.concat(curr),[]);
console.log(flatten);

