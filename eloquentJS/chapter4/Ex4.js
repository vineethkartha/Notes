/*Deep Equal
Write a function deepEqual that takes two values and returns true only if they
are the same value or are objects with the same properties, where the values
of the properties are equal when compared with a recursive call to deepEqual .
To find out whether values should be compared directly (use the === operator
for that) or have their properties compared, you can use the typeof operator.
If it produces "object" for both values, you should do a deep comparison.
But you have to take one silly exception into account: because of a historical
accident, typeof null also produces "object" .
The Object.keys function will be useful when you need to go over the prop-
erties of objects to compare them.
*/
function deepEqual(obj1, obj2) {
    if(typeof(obj1) !== "object" || 
       typeof(obj2) !== "object") {
	if(obj1 === obj2)
	    return true;
	else
	    return false;
    }

    if(obj1 === null ||
       obj2 === null) {
	return (obj1 === obj2);
    }

    
    let obj1Keys = Object.keys(obj1);
    let obj2Keys = Object.keys(obj2);
    if(obj1Keys.length != obj2Keys.length)
	return false;
    for(let index = 0; index < obj1Keys.length; ++index) {
	if(obj1Keys[index] != obj2Keys[index])
	    return false;

	if(obj1[obj1Keys[index]] === "object")
	    return deepEqual(obj1[obj1Keys[index]],obj2[obj2Keys[index]]);
	
	if(obj1[obj1Keys[index]] !== obj2[obj2Keys[index]])
	    return false;
    }

    return true;
}
