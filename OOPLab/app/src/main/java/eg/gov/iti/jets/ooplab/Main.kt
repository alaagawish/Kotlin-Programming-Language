package eg.gov.iti.jets.ooplab


fun main() {

    val rectangle = Rectangle(3.0, 2.0)
    val rectangle2 = Rectangle(5.0, 10.0)
    val circle = Circle(5.0)
    val circle2 = Circle()
    println("tri")
    val triangle = Triangle()
    println("tri")

    val triangle2 = Triangle(10.0, 2.0)

    println("This rectangle area=${rectangle.calcArea()}")
    println("This rectangle area=${rectangle2.calcArea()}")
    println("This triangle area=${triangle.calcArea()}")
    println("This triangle area=${triangle2.calcArea()}")
    println("This circle area=${circle.calcArea()}")
    println("This circle area=${circle2.calcArea()}")
    val picture = Picture()
    println(picture.sumAreas(rectangle, circle, triangle))
    println(picture.sumAreas(rectangle2, circle2, triangle2))

}