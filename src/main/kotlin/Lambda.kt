enum class Directions{
    NORTH,SOUTH,EAST,WEST,START,END
}

class Game{
    var path = mutableListOf(Directions.START)
    var north = {path:MutableList<Directions> ->path.add(Directions.NORTH)}
    var south = {path:MutableList<Directions> ->path.add(Directions.SOUTH)}
    var east = {path:MutableList<Directions> ->path.add(Directions.EAST)}
    var west = {path:MutableList<Directions> ->path.add(Directions.WEST)}
    var end  = {path:MutableList<Directions> ->path.add(Directions.END)
    println("Game Over : ${path.toString()}")
    this.path = mutableListOf(Directions.START)
    }

    fun move(where:()->Unit){
        path.where()
    }

    fun makeMove(mo : String?){

    }
}

fun main(args:Array<String>){
    var g = Game()
    g.north(g.path)
    g.south(g.path)
    g.west(g.path)
    g.end(g.path)
    print(g.path.toString())
}