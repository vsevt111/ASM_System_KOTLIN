package Buildings

open class BaseBuildingMaterial(var numberNeeded : Int = 1) {
}

class Wood : BaseBuildingMaterial(4) {

}

class Brick : BaseBuildingMaterial(8){

}

class Building<T:BaseBuildingMaterial> (var baseMaterialsNeeded:Int = 100,
                                        var actualMaterialsNeeded:T ){
    fun build():String{
        return "${baseMaterialsNeeded*actualMaterialsNeeded.numberNeeded} ${actualMaterialsNeeded::class.simpleName} required"
    }

    fun actualNumberNeed():Int{
        return baseMaterialsNeeded*actualMaterialsNeeded.numberNeeded
    }
}

fun genericOut( l : Building<BaseBuildingMaterial>) = println("test generic out")

fun <R:BaseBuildingMaterial> isSmallBuilding( building:R){
    if (building.numberNeeded*100 < 500) {
        println("small")
    }else{
        println("Big")
    }
}

fun main(args:Array<String>){
    val test1 = Building(100,Wood())
    println(test1.build())
//    genericOut(test1)
}