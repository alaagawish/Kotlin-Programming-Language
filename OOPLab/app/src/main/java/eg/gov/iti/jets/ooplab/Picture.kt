package eg.gov.iti.jets.ooplab

class Picture {
    fun sumAreas(shape1: Shape, shape2: Shape, shape3: Shape): Double {
        return shape1.calcArea() + shape2.calcArea() + shape3.calcArea()
    }
}