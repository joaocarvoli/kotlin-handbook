val numbers = setOf(1, 2, 3, 4, 5, 5)
println(numbers)

val numbersMap = mutableMapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to mapOf("key4.1" to 5)) // mapOf is unmutable
print(numbersMap) // [1, 2, 3, 4, 5]
numbersMap.put("key5", 3)
numbersMap["key4"] = 4
print(numbersMap) // {key1=1, key2=2, key3=3, key4={key4.1=5}}{key1=1, key2=2, key3=3, key4=4, key5=3}