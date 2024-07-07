import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object inventory_management {
    def main(args: Array[String]): Unit ={
        var item = Array("Pen","Ex_book","Pencil","Eraser")
        var stock = Array(20,60,20,10)
    
        displayInventory(item.length-1)
        restockitem("Pen",20)
        sellitem("Pencil",5)
        restockitem("book",30)
        sellitem("ruler",5)


        def displayInventory(x:Int): Any = x match {
            case x if x == 0 => println(item(0),stock(0))
            case _ => displayInventory(x-1) 
                        println(item(x),stock(x))

        
        }

        def restockitem(w:String,y:Int): Any = {
            val string_to_find = w
            if (item.contains(string_to_find)){
                val index_of_string = item.indexOf(string_to_find)
                stock(index_of_string) += y
                println(s"The new stock of $w: ${stock(index_of_string)}")
            }else {
                println("stock is not found in list.")
            }
        }
        def sellitem(w1:String,y1:Int):Any = {
            val string_to_find_1 = w1
            if (item.contains(string_to_find_1)){
                val index_of_string = item.indexOf(string_to_find_1)
                stock(index_of_string) -= y1
                println(s"The new stock of $w1: ${stock(index_of_string)}")
            }else {
                println("stock is not found in list.")
            }
        }

            

        }

}
