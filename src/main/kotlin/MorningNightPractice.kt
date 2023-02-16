fun main(args : Array<String>){
    println("Current Time is ${if (args[0].toInt()<12) "Good Morning" else "Good night, Kotlin"}")
}