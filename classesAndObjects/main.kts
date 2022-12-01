// In Kotlin the classes are closed for inheritance so we need to use the keyword OPEN to me a class able to be inherited
open class Pool(width : Int = 100, height : Int = 2, lenght : Int = 50) {
    var width : Int = width
    var height : Int = height
    protected var lenght : Int = lenght
    private var volume : Int
        get() = width * lenght * height / 100
        set(value) {
            height = (value * 1000) / (width * lenght)
        }

    init { // Constructor without arguments - it doesn't consider the constructor overloading
        println("hi")
        // ...
    }

    constructor(width: Double) : this() { // This type of constructor is used to deal with constructor overloading
        println("hi2")
    }

    fun printSize() {
        println("Width: $width cm " + "Lenght: $lenght cm " + "Height: $height cm" + " and Volume: $volume")
    }
}

class OlimpicPool : Pool() {
    init {
        printSize()
    }
}

fun main(){
    var myPool : Pool = Pool(width = 102)
    myPool.height = 22
    //myPool.lenght = 198
    myPool.printSize() // Width: 102 cm Lenght: 198 cm Height: 22 cm and Volume: 4443
    var myPool2 : Pool = Pool(width = 102, height = 10)
    myPool2.printSize() // Width: 102 cm Lenght: 50 cm Height: 10 cm and Volume: 510
    var myPool3 : Pool = Pool(width = 102, height = 10, lenght = 9)
    myPool3.printSize() // Width: 102 cm Lenght: 9 cm Height: 10 cm and Volume: 91
    /*println(myPool2.volume) // error: cannot access 'volume': it is private in 'Pool' / expected: 510
    myPool2.volume = 12 // error: cannot access 'volume': it is private in 'Pool'
    println(myPool2.volume) // error: cannot access 'volume': it is private in 'Pool' / expected: 102*/
    var olimpicPool : OlimpicPool = OlimpicPool()
    println(olimpicPool.lenght) // error: cannot access 'lenght': it is protected in 'OlimpicPool'
}

main()