import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    dayOfTheGame()
}

main(arrayOf("Koltin"))

val temperature = 10
val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
println(message)

fun dayOfTheGame() : Void? {
    val day = randomDay()
    when (day) {
        "Saturday" -> print("The game needs be schedule for Monday because ")
        "Sunday" -> print("The game needs be canceled because ")
        else -> println("The game was not canceled or schedule")
    }
    println("The suggested day of the game is ${day}!")
    return null
}

fun randomDay() : String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun multipy(x : Int = 3) : Int {
    return 2*x
}

println(multipy()) // 6
println(multipy(5)) // 10
println(multipy(x = 10)) // 20

fun bigNumber(number: Int) = number > 100000000000 // return true or false
bigNumber(10)