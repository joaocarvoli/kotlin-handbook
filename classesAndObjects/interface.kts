interface PoolAction {
    fun cleanPool()
}

interface HouseAction {
    fun cleanHouse()
}

class CaraPool : PoolAction {
    override fun cleanPool() {
        println("cleaning pool")
    }
}

class interTest: PoolAction, HouseAction {
    override fun cleanPool() {
        TODO("Not yet implemented")
    }

    override fun cleanHouse() {
        TODO("Not yet implemented")
    }
}

fun main(){
    val caraPool = CaraPool()
    caraPool.cleanPool()
}

main()