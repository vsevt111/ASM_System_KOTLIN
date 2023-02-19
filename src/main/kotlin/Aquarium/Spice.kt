package Aquarium

class Spice(var name:String, var spciness:String) {
    var heat:Int=5
        get() = 5
    val spiceList = listOf("mild","spicy","power spicy")
    init{
        println("object spice created.")
        println(this.name)
        println(this.spciness)
    }
}

fun makeSalt(){

}