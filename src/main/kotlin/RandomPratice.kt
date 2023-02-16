fun main(args: Array<String>){
    println("Your fortune is : ${getFortuneCookie()}")
}
fun getFortuneCookie():String{
    val greetingSent = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    print("Enter your birthday : ")
    var birthday : Int? = readLine()?.toIntOrNull()
    var ind : Int = birthday?.rem(7) ?: 0
    return greetingSent[ind]

}