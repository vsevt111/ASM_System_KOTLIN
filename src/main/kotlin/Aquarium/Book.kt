package Aquarium

open class Book(var title:String , var author:String ) {

    private var currentPage:Int = 0
    open fun readPage() {
        currentPage+=1
        println(this.currentPage)
    }
}

class eBook(var format:String = "text") : Book("ebook","ebookauthor"){
    private var currentWord : Int =0
    override fun readPage() {
        currentWord += 250
        println(this.currentWord)
    }
}