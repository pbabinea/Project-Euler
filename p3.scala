/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

def checkPrime(num:Long):Boolean = {
    var ret = true
    var i = 2L
    while (i <= num/2) {
        if (num%i == 0) {
            ret = false
            i = num
        }
        else i += 1
    }
    ret
}

var found = false
var curr = 2L

while (!found) {
    if (600851475143L%curr==0) {
        if (checkPrime(600851475143L/curr)) {
            println(600851475143L/curr)
            found = true
        }
        else curr += 1
    }
    else curr += 1
}