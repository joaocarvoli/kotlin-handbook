val numberOfCourses : Int = 35
val numberOfProfessors : Int = 12

if (numberOfCourses > numberOfProfessors) {
  println("We don't have professors enough. ${numberOfProfessors} professors and ${numberOfCourses} courses")
} else {
  println("We have professors enough")
}

val fish : Int = 50
if (fish in 1..40) {
    println("The ${fish} is in the range")
} else {
    println("The ${fish} is not in the range")
}

if (fish == 0){
    println("Empty tank")
} else if (fish < 40){
    println("Got fish!")
} else {
    println("That's a lot of fish!")
}

val numberOfFish : Int = 12

when (numberOfFish) {
    0 -> println("Empty tank")
    in 1..15 -> println("Got fish")
    else -> println("That's a lot of fish!")
}