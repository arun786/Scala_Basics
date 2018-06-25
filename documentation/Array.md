# Arrays

## ways to define an array in scala

    package ArraysInScala
    
    /**
      * Created by Adwiti on 6/24/2018.
      */
    object DefineAnArray {
    
      def main(args: Array[String]): Unit = {
    
        //  First way of declaring an array
        val greetings = new Array[String](3)
        greetings(0) = "Hello"
        greetings(1) = "Java"
        greetings(2) = "world"
        for (i <- 0 to greetings.length - 1)
          print(greetings(i) + " ")
        println()
        // second way
        val greeting = Array("Hello", "Java", 1)
        for (i <- 0 to greeting.length - 1)
          print(greeting(i) + " ")
    
        //Third way
    
        println()
        val greet: Array[String] = Array("Hello", "World")
        for (i <- 0 to greet.length - 1)
          print(greet(i) + " ")
    
        //when we explicitly mention type, then we have to use the same data type
        println()
        val number : Array[Int] = Array.apply(1,2,3,45)
        for( i <- 0 to number.length - 1)
          print(number(i) + " " )
      }
    
    
    }
