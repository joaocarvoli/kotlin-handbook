var temperature = 20
var downLimit = { limit : Int -> limit / 2 }
println(downLimit(temperature))

val tempLimit : (Int) -> Int = {temp -> temp / 2}
println(tempLimit(100))

fun applyFun(data: Int, operation: (Int) -> Int): Int {
    return operation(data)
}

fun increaseTemp(start: Int) = start + 3

println(applyFun(100, tempLimit))
println(applyFun(24, ::increaseTemp)) // functions that are not lambda require the ::


