package eg.gov.iti.jets.classes

data class Person(var name: String, var address: Address) {
    data class Address(
        var streetName: String,
        var city: String,
        var building: Building
    )
    enum class Building {
        VILLA,
        APARTMENT;

    }

}

