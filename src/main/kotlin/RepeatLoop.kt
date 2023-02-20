import kotlin.random.Random

fun main(args: Array<String>) {
    var fortune: String
    var i : Int = 0
    while (i<10) {
        fortune = getFortuneV2(getBirthdayV2())
        println("\nYour fortune is: $fortune")
        i+=1
        if (fortune.contains("Take it easy")) break;
    }
}

fun getBirthdayV2() : Int{
    return Random.nextInt(31)
}

fun getFortuneV2(birth : Int) : String{
    val greetingSent = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    return when(birth){
        28-31 ->"Today is a good day for exercising restraint."
        1-7 ->  "Enjoy a wonderful day of success."
        else -> greetingSent[birth%7]
    }
}