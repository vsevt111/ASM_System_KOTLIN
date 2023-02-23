package Book

import kotlin.random.Random

const val maxBook : Int = 500;
class Book(var title:String, var author:String,var year: String,var amount:Int) {

    fun canBorrow():Boolean{
        return amount< maxBook
    }
    fun titleAuthor(): Pair<String, String>{
        return title to author
    }
    fun titleAuthorYear(): Triple<String,String,String>{
        return Triple(title,author,year)
    }

    fun printUrl():String{
        return Constants.BASE_URL+".html" + BASE_URL_BOOK
    }

    companion object{
        const val BASE_URL_BOOK : String ="www.google.com/shakespare"
    }
}

object Constants{
    const val BASE_URL: String = "www.google.com/shakespare"
}

var Book.pages : Int
        get() = amount
        set(value) {amount=value}

fun Book.getWeight() : Double{
    return 1.5*this.pages
}

fun Book.tornPage(torn:Int){
    this.pages = this.pages-torn
}

class Puppy{
    fun playWithBook(b:Book){
        b.pages-= Random.nextInt(b.pages)
    }
}

fun main(args:Array<String>){
    val b = Book("The Shop","Manin","2023",500)
    b.pages= 300
    var p = Puppy()
    p.playWithBook(b)
    println(b.getWeight())
    println(b.canBorrow())
    println(Constants.BASE_URL)
    println(b.printUrl())
    println("Here is your book ${b.titleAuthorYear().first} written by ${b.titleAuthorYear().second} in ${b.titleAuthorYear().third}}.")
}