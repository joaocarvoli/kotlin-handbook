// the keyword 'data' is like a struct in other languages
data class Decoration(val rocks: String) {
    fun makeDecorations() {
        val decoration1 = Decoration("home")
        val decoration2 = Decoration("house")
        val decoration3 = Decoration("home")
        println(decoration1 == decoration2) // false
        println(decoration1 == decoration3) // true
        println(decoration2 == decoration3) // false
    }
}

data class bodyMeasures(val weight : Int, val height: Int){
}



fun main(){
    val decoration = Decoration(rocks="granite").makeDecorations()
    val person1 = bodyMeasures(90, 192)
    val (weight, height) = person1 // unpacking the data object
    println(weight) // 90
    println(height) // 192
}

main()