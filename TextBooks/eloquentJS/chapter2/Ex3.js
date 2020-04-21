/* Chessboard
Write a program that creates a string that represents an 8×8 grid, using newline
characters to separate lines. At each position of the grid there is either a space
or a "#" character. The characters should form a chessboard.
*/

let symbol = '#';
let rIndex = 0;
let cIndex = 0;
let size = 8;
for(rIndex = 0;rIndex < size; rIndex +=1) {
    let str = ''
    for(cIndex = 0;cIndex < size; cIndex +=1) {
	if((rIndex + cIndex) % 2 == 0)
	    str +=' ';
	else
	    str += symbol;
    }
    console.log(str)
}
