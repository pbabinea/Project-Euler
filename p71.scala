/*
Consider the fraction, n/d, where n and d are positive integers. If n<d and HCF(n,d)=1, it is called a reduced proper fraction.

If we list the set of reduced proper fractions for d ≤ 8 in ascending order of size, we get:

1/8, 1/7, 1/6, 1/5, 1/4, 2/7, 1/3, 3/8, 2/5, 3/7, 1/2, 4/7, 3/5, 5/8, 2/3, 5/7, 3/4, 4/5, 5/6, 6/7, 7/8

It can be seen that 2/5 is the fraction immediately to the left of 3/7.

By listing the set of reduced proper fractions for d ≤ 1,000,000 in ascending order of size, find the numerator of the fraction immediately to the left of 3/7.
*/
//tried to make its runtime faster by reducing iterations with while loop
def GCF(num1:Int, num2:Int):Int = {
    var maxFactor = 0
    val big = if (num1 < num2) num2 else num1
    val small = if (num1 < num2) num1 else num2
    var i = small
    while (i >= 1){
        if (num1%i == 0 && num2%i == 0) {
            maxFactor = i
            i = 0
        }
        i -= 1
    }
    maxFactor
}

var ans = (0.0,1.0)
for (d <- 1 to 1000000) {
    for (n <- 1 to d/2) {
        if (n.toDouble/d.toDouble < 3.0/7.0 && n.toDouble/d.toDouble > ans._1/ans._2){
            if (GCF(n,d)==1) ans = (n.toDouble,d.toDouble)
        }
    }
}
println(ans._1)
//it takes like 50 minutes but it works B)