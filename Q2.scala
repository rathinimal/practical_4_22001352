import scala.io.StdIn.readInt

object patternMatching {
    def main(args: Array[String]): Unit ={
        print("Enter an Integer: ")
        var a = readInt()

        if (isEven(a)) {
            println(s"Entered no $a is Even number.")
        }else {
            println(s"Entered no $a is Odd number.")
        }

    }

    def isEven(x:Int): Boolean = x match{
        case 0 => true
        case _ => isOdd(x-1)
    }

    def isOdd(y:Int):Boolean = !(isEven(y))
}