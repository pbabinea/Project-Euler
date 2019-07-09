/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/

def checkPrime(num:Long):Boolean = {
    var ret = true
    var i = 2L
    while (i <= num/2L) {
        if (num%i == 0) {
            ret = false
            i = num //ends the loop early to make it faster
        }
        else i += 1
    }
    ret
}

var primes = List[Long](2L)

for (i <- 3L to 2000000L by 2L) {
    println(i)
    if (checkPrime(i)) {
        println("^ prime")
        primes ::= i
    }
}

println(primes.sum)