import java.util.Arrays

val house : List<String> = listOf("john", "maria", "amanda", "ademar") // The lists are unmutable default
println(house)
val house2 : MutableList<String> = mutableListOf("john", "maria", "amanda", "ademar")
house2.remove("amanda")
println(house2)

val house3 = arrayOf("john", "maria", 1, "ademar") // Is possible mix types in the array
println(house3[0])
println(Arrays.toString(house3))

val words : List<String> = listOf("earth", "world", "planet")
val lenWords = words.map { it.length }
println(words)
println(lenWords)

for (word in words) {
    println(word)
}

for ((index, element) in words.withIndex()) {
    println("The index of ${element} is ${index}")
}

for (i in 1..10){
    print(i)
}

for (i in 5 downTo 1){
    print(i)
}
println("")
for (i in 3..11 step 2) print(i)
println("")
for (i in 'a'..'z') print(i)

println("")
repeat(3) {
    println("It works")
}

val arrayTest = Array(5, { 0 })
for (i in arrayTest){
    println(i)
}
