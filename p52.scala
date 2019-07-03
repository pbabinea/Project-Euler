/*
It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits, but in a different order.

Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
*/

//checks if all multiples have the same number of digits
def checkLength(vals:Array[String]):Boolean = {
    var ret = true
    for (i <- vals.indices) {
        if (vals(0).length != vals(i).length) ret = false
    }
    ret
}

//bubble sort for numbers that are actually strings lol
def sort(arr:Array[String]):Boolean = {
    for (i <- arr.indices) {
        for (j <- arr.indices) {
            if (arr(i).toInt < arr(j).toInt) {
                var tmp = arr(i)
                arr(i) = arr(j)
                arr(j) = tmp
            }
        } 
    }
    true
}

var found = false
var curr = 1
while(found == false) {
    var strings = Array.tabulate(6)(n => ((n+1)*curr).toString)
    if (!checkLength(strings)) curr += 1
    else {
        var arrs = Array[Array[String]]()
        for (i <- strings.indices) {
            var num = Array[String]()
                for (j <- 0 to strings(i).length-1) {
                    if (j == 0) num +:= strings(i).substring(0,1)
                    else if (j == strings(i).length-1) num :+= strings(i).substring(j)
                    else num :+= strings(i).substring(j, j+1)
                }
            arrs :+= num
        }
        arrs.foreach(n => sort(n))
        if (arrs(0).sameElements(arrs(1)) && arrs(1).sameElements(arrs(2)) && arrs(2).sameElements(arrs(3)) && arrs(3).sameElements(arrs(4)) && arrs(4).sameElements(arrs(5))) {
            println(curr)
            found = true
        }
        else curr += 1
    }
}
