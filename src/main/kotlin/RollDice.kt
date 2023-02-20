import java.util.*
import kotlin.random.Random

fun main(args:Array<String>){
    val rollDice: (Int) -> Int = {side  ->
        when {
            side == 0 -> 0
            else -> Random.nextInt(side)
        }
    }
    println(rollDice(5))
}