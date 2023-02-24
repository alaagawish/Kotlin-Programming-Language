package eg.gov.iti.jets.functions

data class Complex(var real: Int = 0) {
    var imag: Int = 0

    constructor(real: Int, imag: Int) : this(real) {
        this.imag = imag
    }

    operator fun plus(complex: Complex) = Complex(real + complex.real, imag + complex.imag)

    override fun toString(): String {
        return "$real + $imag i"
    }

}

infix operator fun Complex.minus(complex: Complex) =
    Complex(real - complex.real, imag - complex.imag)

fun Complex.println(): Unit {
    if (imag > 0)
        println("$real + $imag i")
    else if (imag == 0)
        println("$real")
    else
        println("$real $imag i")
}