package Assignment3 {

  object EntryPoint extends App {
    //question1
    val list1 = List(10, 20, 30, 40)
    val list2 = List(1, 2, 3, 4)
    val num = 4
    val obj = new Task
    val list3 = println("added list is :" + obj.addList(list1, list2))
    val fibonacci = println("fibonacci number is :" + obj.fibonacci(num))
    val result = println("result of doubled list " + obj.doubleList(list2))

    println("Area of different figures")
    val rectange = {
      println(obj.areaOfShapes("rectangle", 3, 4, (p, q) => p * q))
    }
    val rhombus = {
      println(obj.areaOfShapes("rhombus", 3, 4, (p, q) => p * q / 2))
    }
    val parallelogram = {
      println(obj.areaOfShapes("parallellogram", 3, 4, (p, q) => p * q))
    }


    val listLength = println("length of the list is :" + obj.listLength(list2))
    //val listReverse= println("length of the list" + obj.listReverse(list2))

    val listReverse = println("reverse of a list is :" + obj.listReverse(list1))


  }

  class Task {
    def addList(list1: List[Int], list2: List[Int]): List[Int] = {

      val addedList = for (i <- 0 until list1.length) yield (list1(i) + list2(i))
      addedList.toList

    }


    def fibonacci(number: Int): Int = {
      number match {
        case head if (head == 0) => 0
        case head if (head == 1) => 1
        case _ => fibonacci(number - 1) + fibonacci(number - 2)
      }
    }


    //question 3

    def areaOfShapes(shape: String, side1: Int, side2: Int, result: (Int, Int) => Int): Unit = {
      val output = result(side1, side2)
      val a = println(s"area of $shape is ${output.toString()}")
    }


    // question4


    def doubleList(list4: List[Int]): List[Int] = {

      list4.map(value => value * 2)

    }

    /*
        def kthElement(number: Int, list: List[Int]): Int = {
      def nthRecursive(n: Int, list: List[Int]): A = (n, ls) match {
      case


        }*/


    // question 6

    def listLength(list: List[Int]): Int = {
      list match {
        case head :: tail => 1 + listLength(tail)
        case head => 1

      }

    }



       def listReverse(list: List[Int]): Unit = {
         for(i <-list.length to 1 by-1)
           {
             println(list(i))
           }
       }
  }

}



