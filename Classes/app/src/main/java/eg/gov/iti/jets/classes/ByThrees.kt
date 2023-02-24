package eg.gov.iti.jets.classes

import eg.gov.iti.jets.classes.Number

class ByThrees : Number {
    override var start: Int = 0
        get() {
            return field
        }
        set(value) {
            field = value
            current = value
        }
    override var current: Int = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }

    override fun getNext(): Int {
        current += 3
        return current
    }

    override fun reset() {
        current = start
    }


}