/* Minimum
The previous chapter introduced the standard function Math.min that returns
its smallest argument. We can build something like that now. Write a function
min that takes two arguments and returns their minimum.
*/

const minimum = function(num1, num2) {
    if(num1 < num2)
	return num1;
    else
	return num2;
}
