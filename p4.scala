/*
A palindromic number reads the same both ways. 
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

def checkPal(num:Int):Boolean = {
    val str = num.toString
    if (str.length%2 != 0) {
        if (str.substring(0,(str.length/2)+1) == str.substring(str.length/2).reverse) true
        else false
    } else {
        if (str.substring(0,str.length/2) == str.substring(str.length/2).reverse) true
        else false
    }
}

var pals = List[Int]()
for (i <- 999 to 100 by -1) {
    for (j <- i to 100 by -1) {
        if (checkPal(i*j)) pals ::= i*j
    }
}
println(pals.max)