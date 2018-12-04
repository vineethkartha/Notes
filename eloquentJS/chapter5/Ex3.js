/*
Everything
Analogous to the some method, arrays also have an every method. This one
returns true when the given function returns true for every element in the array.
In a way, some is a version of the || operator that acts on arrays, and every is
like the && operator.
Implement every as a function that takes an array and a predicate function
as parameters. Write two versions, one using a loop and one using the some
method.*/

function every(array, test) {
    for(let elem of array) {
	if(!test(elem))
	    return false;
    }
    return true;
}

function everyWithSome(array,test) {
    return !array.some(elem=>!test(elem));
}

console.log(every([2, 4, 6], n => n%2 == 0));
console.log(everyWithSome([2, 4, 6], n => n%2 == 0));
console.log(every([1, 4, 6], n => n%2 == 0));
console.log(everyWithSome([1, 4, 6], n => n%2 == 0));
