fun main(args:Array<String>){
    print(whatShouldIDoToday("sad"))
}

fun whatShouldIDoToday(mood:String, weather:String = "Sunny" , temperature:Int = 24) : String{
    return when(mood){
        "happy"  -> when(weather){
            "sunny" -> "go for a walk"
            else -> "Stay home and read."
        }
        else -> "Stay home and read."
    }
}