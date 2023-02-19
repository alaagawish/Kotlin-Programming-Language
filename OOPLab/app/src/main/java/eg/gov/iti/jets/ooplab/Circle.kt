package eg.gov.iti.jets.ooplab

const val PI = 3.14

class Circle : Shape {

    constructor() : super() {
        super.dim = 1.0
    }

    constructor(radius: Double) : this() {
        super.dim = radius
    }

    override fun calcArea(): Double {
        return PI * dim * dim
    }


}