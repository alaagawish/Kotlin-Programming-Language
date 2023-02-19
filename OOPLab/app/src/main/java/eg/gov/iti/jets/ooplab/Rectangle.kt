package eg.gov.iti.jets.ooplab

class Rectangle : Shape {
    private var height: Double = 1.0
        get() {
            return field
        }
        set(value) {
            field = if (value.isNaN()) 1.0 else value

        }

    constructor(width: Double) : super() {
        super.dim = width
    }

    constructor(width: Double, height: Double) : this(width) {
        super.dim = width
        this.height = height
    }

    override fun calcArea(): Double {
//        println("Area of Rectangle = ${dim * height} ")
        return dim * height
    }
}