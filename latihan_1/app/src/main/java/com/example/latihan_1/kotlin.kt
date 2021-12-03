interface list<T>{
        operator fun get(indec:Int):T
}

class ListNumber<T>: list<T>{
        override fun get(indec: Int): T {
                TODO("Not yet implemented")
        }
}


fun main()  {
        val number= listNumber<int>()
        val number= ListNumber<long>()
        val number= listNumber<short>()
        val number= listNumber<string>()
        val number= listNumber<char>()
}