object letter {
    def main(args: Array[String]): Unit ={
        toUpper("Benny")
        formatNames("Nirsoan")
        toLower("Saman")
        formatNames1("Kumara")


        def toUpper(w1:String): Any ={
            println(s"${w1.toUpperCase()}")
        }

        def toLower(w2:String): Any = {
            println(s"${w2.toLowerCase()}")
        }

        // for Niroshan output NIroshan
        def formatNames(w3:String): Any ={
            println(w3.substring(0,2).toUpperCase() + w3.substring(2).toLowerCase())
        }

        // for Kumara output KumarA
        def formatNames1(w4: String): Any ={
            println(w4.substring(0,1).toUpperCase() + w4.substring(1,5) + w4.substring(5).toUpperCase())
        }
    }

}