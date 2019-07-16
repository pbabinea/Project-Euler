/*
The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

def squareSum(num:Int):Int = {
    List.tabulate(num)(n => (n+1)*(n+1)).sum
    /* (both ways work)
    var ans = 0
    for (i <- 1 to num) ans += i*i
    ans
    */
}

def sumSquare(num:Int):Int = {
    (List.tabulate(num)(n => n+1).sum)*(List.tabulate(num)(n => n+1).sum)
    /* (both ways work)
    var sum = 0
    for (i <- 1 to num) sum += i
    sum * sum
    */
}

println(sumSquare(100) - squareSum(100))