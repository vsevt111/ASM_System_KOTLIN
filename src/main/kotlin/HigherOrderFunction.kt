

fun divThree(num : List<Int> , block:List<Int>.()->Unit){
    num.block()
}

fun main(args:Array<String>){
    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)

    divThree(numbers){
        var numBlock = mutableListOf<Int>()
        numbers.forEach { it->
            if (it%3==0 ){
                numBlock.add(it)
            }
        }
        println(numBlock)
    }
}