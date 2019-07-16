/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/
for (i <- 1 to 500) {
    for (j <- i+1 to 500) {
        for (k <- j+1 to 500) {
            if (i+j+k == 1000 && i*i + j*j == k*k) println(i*j*k)
        }
    }
}