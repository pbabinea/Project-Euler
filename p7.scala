/*
By listng the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/

def checkPrime(num:Long):Boolean = {
    var ret = true
    for (i <- 2L to num-1) {
        if (num%i == 0) ret = false 
    }
    ret
}

var primes = List[Int]()
var i = 2;
while (primes.length < 10009) {
    println(i)
    if (checkPrime(i)) primes ::= i
    i += 1
}

println(primes(10002))