/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
*/

val nine = "onetwothreefourfivesixseveneightnine".length
val teens = "teneleventwelvethirteenfourteenfifteensixteenseventeeneighteennineteen".length
val twenties = "twenty".length * 10 + nine
val thirties = "thirty".length * 10 + nine
val forties = "forty".length * 10 + nine
val fifties = "fifty".length * 10 + nine
val sixties = "sixty".length * 10 + nine
val seventies = "seventy".length * 10 + nine
val eighties = "eighty".length * 10 + nine
val nineties = "ninety".length * 10 + nine

val first99 = nine + teens + twenties + thirties + forties + fifties + sixties + seventies + eighties + nineties

val hundredBase = "hundred".length * 100 + 3*99 + first99

var sum = first99

for (i <- 1 to 9) {
    i match {
        case 1 => sum += "one".length * 100 + hundredBase
        case 2 => sum += "two".length * 100 + hundredBase
        case 3 => sum += "three".length * 100 + hundredBase
        case 4 => sum += "four".length * 100 + hundredBase
        case 5 => sum += "five".length * 100 + hundredBase
        case 6 => sum += "six".length * 100 + hundredBase
        case 7 => sum += "seven".length * 100 + hundredBase
        case 8 => sum += "eight".length * 100 + hundredBase
        case 9 => sum += "nine".length * 100 + hundredBase
        case _ =>
    }
}
sum += "onethousand".length
println(sum)