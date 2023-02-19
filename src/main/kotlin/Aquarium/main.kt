package Aquarium

fun main(args:Array<String>){
    val SimpleSpice = SImpleSpices()
    val eBook = eBook()

    val spice = Spice("meat","mild")
    System.out.println(SimpleSpice.heat)
    System.out.println(SimpleSpice.name)
    eBook.readPage()
    eBook.readPage()
    print(eBook.title)
}