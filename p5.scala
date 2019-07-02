/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

def check(num:Int):Boolean = {
    var ret = true
    for (i <- 1 to 100) {
        if (num%i != 0) ret = false
    }
    ret
}

var found = false
var curr = 1
while (found == false) {
    if (!check(curr)) curr += 1
    else {
        found = true
        println(curr)
    }
}
