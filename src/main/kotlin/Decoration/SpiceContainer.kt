package Decoration

data class SpiceContainer(val label:String)

fun main(args:Array<String>){
    val s1 = SpiceContainer("name 1")
    val s2 = SpiceContainer("name 2")

    val (label) = s2
    println(s1)
    println(s2)
    println(label)
}
