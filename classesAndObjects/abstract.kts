abstract class FishPool {
    abstract val color : String // To override this val is necessary to add the keywork 'abstract'
}

class SharkPool : FishPool() {
    override val color = "gray" // implementing the member
}

fun main(){
    val sharkPool = SharkPool()
    println(sharkPool.color)
}

main()