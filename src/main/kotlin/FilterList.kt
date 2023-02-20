fun main(args:Array<String>){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val spicesCurry = spices.filter{it.contains("curry")}
    val spicesFilterCE = spices.filter { it[0]=='c' && it.last()=='e' }
    println(spicesCurry)
    print(spicesFilterCE)
    val spicesFirstThree = spices.subList(0,3).filter { it[0]=='c' }
    print(spicesFirstThree)
}