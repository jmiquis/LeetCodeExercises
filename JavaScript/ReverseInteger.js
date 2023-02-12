/*Given a signed 32-bit integer x,
return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1],
then return 0.*/

if(x>0){
    x = x.toString()
                .split("")
                .reverse()
                .join("")
}else{
    x = x*-1
    x= (x.toString()
                .split("")
                .reverse()
                .join(""))*-1
}
return (x<=-2147483648 || x>=2147483647) ? 0 : x;