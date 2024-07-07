import scala.io.StdIn.readLine
import scala.io.StdIn.readInt
import scala.collection.mutable.Map

object inventory_management {
    def main(args: Array[String]): Unit ={
        var item = Array("Pen","Ex_book","Pencil","Eraser")
        var stock = Array(20,60,20,10)
    
        displayInventory(item.length-1)


        def displayInventory(x:Int): Any = x match {
            case x if x == 0 => println(item(0),stock(0))
            case _ => displayInventory(x-1) 
                        println(item(x),stock(x))

        
        }

        def restockitem(item:Array[String],y:Int): Any {
             stock(y) = stock(y)+y
             println(s"The new stock of $item()")
        }

}
}