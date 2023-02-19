package Spice

//จะเป็น subclass ได้แค่ในไฟล์นี้เท่านั้นถ้าใช้ sealed keyword
sealed abstract class Spice{

     abstract fun prepareSpice()
}
enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF),YELLOW(0xFFFF00);
}

interface Grinder{
    abstract fun grind()
}

class Curry(val spciness: String) : Spice(),Grinder,
    SpiceColor by  YellowSpiceColor{
    override fun prepareSpice()=print(spciness)
    override fun grind() =print("grind curry powder")

}

interface SpiceColor{
    val color : Color
}

object YellowSpiceColor : SpiceColor{
    override val color:Color=Color.YELLOW
}

fun main (args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco = Curry("mild")
    println("Fish has has color ${pleco.color}")
    pleco.grind()
}

//template
interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

class Plecostomus (fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat a lot of algae"),
    FishColor by fishColor