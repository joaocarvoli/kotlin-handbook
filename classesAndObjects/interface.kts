interface PoolAction {
    fun cleanPool()
}

class CaraPool : PoolAction {
    override fun cleanPool() {
        println("cleaning pool")
    }
}

fun main(){
    val caraPool = CaraPool()
    caraPool.cleanPool()
}

main()