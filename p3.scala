/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

var factors = List[Long]()
var primeFactors = List[Long]()

for (i <- 1L to 600851475143L) {
    if (600851475143L%i == 0) factors ::= i
}

def checkPrime(num:Long):Boolean = {
    var ret = true
    for (i <- 2L to num-1) {
        if (num%i == 0) ret = false 
    }
    ret
}

for (i <- factors.indices) {
    if (checkPrime(factors(i))) primeFactors ::= factors(i)
}

println(primeFactors.max)

//if (checkPrime(13)) println("13 is prime") else println("13 is not prime")
//if (checkPrime(4)) println("4 is prime") else println("4 is not prime")