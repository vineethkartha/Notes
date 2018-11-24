/*Reversing an array
Arrays have a reverse method that changes the array by inverting the order in
which its elements appear. For this exercise, write two functions, reverseArray
and reverseArrayInPlace . The first, reverseArray , takes an array as argument
and produces a new array that has the same elements in the inverse order. The
second, reverseArrayInPlace , does what the reverse method does: it modifies
the array given as argument by reversing its elements. Neither may use the
standard reverse method.
*/

function revereseArray(array) {
    let revArray = []
    for(index = array.length-1; index >= 0; --index) {
	revArray.push(array[index]);
    }
    return revArray;
}

function reverseArrayInPlace(array) {
    for(front=0, back =array.length-1; front<=back; ++front, --back) {
	let temp = array[front];
	array[front] = array[back];
	array[back] = temp;
    }
}
