/* Write a loop that makes seven calls to console.log to output the following
triangle:
#
##
###
####
#####
######
#######

*/

var hash= "#";
var index = 0;
while(index<7) {
    console.log(hash);
    index +=1;
    hash +="#"
}
