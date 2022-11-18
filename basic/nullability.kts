//val sugar : String = null // error: null can not be a value of a non-null type String
val sugar : String? = null

var amountOfFood : Int = 6
println("The amount of food before change is: ${amountOfFood}")
if (amountOfFood != null) {
    amountOfFood = amountOfFood?.dec() ?: 0 // if not null -> amountOfFood = amountOfFood - 1 / if null amountOfFood = 0
    println("The amount of food is: ${amountOfFood}")
}

amountOfFood = amountOfFood?.inc() ?: 0 // if not null -> amountOfFood = amountOfFood + 1 / if null amountOfFood = 0
println("The amount of food is: ${amountOfFood}")

