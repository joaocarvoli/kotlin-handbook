import kotlin.reflect.typeOf

fun printHello(){
  println("Hello, world!")
}

printHello()

// Basic Operations

println(1 + 1) // 2 -> type = Int
println(1.0/2.0) // 0.5 -> type = Double
println(2.0*3.5) // 7.0 -> type = Double
println(3.times(3)) // 9 -> type = Int
println(3.plus(4.5)) // 7.5 -> type = Double
println(2.div(2.5)) // 0.8 -> type = Double

// Variables

// // Numbers

val i : Int = 1
val j : Double = 6.5

println(i::class.simpleName) // Int
println(j::class.simpleName) // Double

val k = j.toInt()
println(j.toFloat() - j.toInt()) // 0.5
println(k) // 6
println(k::class.simpleName) // Int

// // String

val l : String = j.toString()
println("${l}, type: ${l::class.simpleName}") // 6.5, type: String

val m : String = "Home"
println(m.split("")) // [, H, o, m, e, ]

// Val -> unchangeable
// Var -> changeable

// m = "A house is not the same thing that a home" // error: val cannot be reassigned

var n : String = "Home"
n = "A house is not the same thing that a home"
println("${n}, type: ${n::class.simpleName}") // A house is not the same thing that a home, type: String
