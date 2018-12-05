/* A vector type
Write a class Vec that represents a vector in two-dimensional space. It takes
x and y parameters (numbers), which it should save to properties of the same
name.
Give the Vec prototype two methods, plus and minus , that take another
vector as a parameter and return a new vector that has the sum or difference
of the two vectorsÅf ( this and the parameter) x and y values.
Add a getter property length to the prototype that computes the length of
the vectorÅ\that is, the distance of the point (x, y) from the origin (0, 0).
*/

class Vec {
    constructor(x,y) {
	this.x = x;
	this.y = y;
    }
    plus(vec2) {
	return new Vec(this.x + vec2.x, this.y + vec2.y);
    }
    minus(vec2) {
	return new Vec(this.x - vec2.x, this.y - vec2.y);
    }
    get length() {
	return Math.sqrt(this.x * this.x + this.y * this.y);
    }
    
}
