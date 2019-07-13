/*
Using names.txt, a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?
*/
import scala.io.Source

val nameSource = Source.fromFile("names.txt")
val nameString = nameSource.getLines.mkString
val names = nameString.filter(_!='"').split(",").sorted
nameSource.close

var sum = 0
for (i <- names.indices) {
    var nameSum = 0
    names(i).toArray.map(_.toLower).foreach(n => nameSum += n-96)
    sum += nameSum*(i+1)
}
println(sum)