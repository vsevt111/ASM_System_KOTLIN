fun main(args:Array<String>){
    var allBooks = setOf("Hamlet","Romeo and Juliet","A Midsummer Night's Dream")
    var library = mapOf(allBooks to "William Shake")
    var moreBooks = (mutableMapOf("The Merchant Of Venice" to "William Shake"))
    moreBooks.put("Much Ado About Nothing" ,"William Shake")
    println(library.any{it.key.contains("Hamlet")})
    println(moreBooks.toString())
    println(moreBooks.getOrPut("test 1"){"not found"})
}