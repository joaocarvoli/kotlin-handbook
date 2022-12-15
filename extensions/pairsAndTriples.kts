fun main(){
    val case = "i need a bible" to "read"
    println("${case.first} to ${case.second}")

    val case2 = Triple(1,2,3) // a triple only accepts 3 values as params
    println(case2.toList())
    val (a, b, c) = case2
    println("${a},${b},${c}")

    val case3 = ("i need a bible" to "read") to "and to do my notes"
    println("${case3.first.first} to ${case3.first.second} ${case3.second}")

}
main()