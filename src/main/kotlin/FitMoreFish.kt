fun main(args:Array<String>){
    print(canAddFish(10.0, listOf(3,3,3)))
    print(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    print(canAddFish(9.0, listOf(1,1,3), 3))
    print(canAddFish(10.0, listOf(), 7, true))
}

fun canAddFish(tankSize : Double ,
               currentFish :List<Int>,
               fishSize :Int=2,
               hasDecorations :Boolean = true):Boolean{
    var sumLength :Int = 0;
    for (i in currentFish) sumLength+=i

    return when(hasDecorations) {
        true -> (sumLength + fishSize) <= tankSize*0.8
        false -> (sumLength + fishSize) <= tankSize
    }
}