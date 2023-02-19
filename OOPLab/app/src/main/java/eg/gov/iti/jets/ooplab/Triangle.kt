package eg.gov.iti.jets.ooplab

class Triangle(dim: Double, private var height: Double) : Shape(dim) {
    init {
        println("this is the primary constructor ")
    }

    constructor() : this(1.0, 1.0) {
        println("Default constructor with width=$dim and height=$height")
    }

    fun getHeight(): Double {
        return height
    }

    fun setHeight(value: Double) {
        height = value
    }

    override fun calcArea(): Double {
        return 0.5 * dim * height
    }
}