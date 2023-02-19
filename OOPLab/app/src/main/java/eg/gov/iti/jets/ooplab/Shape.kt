package eg.gov.iti.jets.ooplab

abstract class Shape() {
    var dim: Double = 1.0
        get() {
            return field
        }
        set(value) {
            field = if (value.isNaN()) 1.0 else value

        }

    constructor(dim: Double) : this() {
        this.dim = dim
    }

    abstract fun calcArea(): Double
}