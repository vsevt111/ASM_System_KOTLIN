fun main(args : Array<String>){
    whatShouldIDoTodayUpdate("sad")
}

fun isGood(mood:String, weather:String = "Sunny" , temperature:Int = 24) = mood == "sad" && weather == "rainy" && temperature == 0
fun isTooHot(mood:String, weather:String = "Sunny" , temperature:Int = 24) = temperature > 35

fun whatShouldIDoTodayUpdate(mood:String, weather:String = "Sunny" , temperature:Int = 24) : String{
    return when{
        isGood(mood,weather,temperature) -> "stay in bed"
        isTooHot(mood,weather,temperature) -> "go swimming"
        else -> "default pattern"
    }
}