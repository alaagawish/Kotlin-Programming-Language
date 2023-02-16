package eg.gov.iti.jets.lab1

fun main() {
    var pattern: String = "*"
    var pattern2: String = "* "
    var spaces: String = " "
    for (i in 1..7) {
        println("${pattern.repeat(i)}${spaces.repeat(8 - i)}${pattern2.repeat(i)}")
    }
//    var x: String = readln()
//    print(x.isBlank())
//    print(x.isEmpty())
//    var numberOfLines=5
//    for (i in 1..numberOfLines) {
//        for (j in 1..i) {
//            print("*")
//        }
//        print("\t")
//        for (j in 1..i) {
//            print("* ")
//        }
//        println("")
//    }
}