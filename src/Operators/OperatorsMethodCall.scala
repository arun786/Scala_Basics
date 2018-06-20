package Operators

/**
  * Created by Adwiti on 6/19/2018.
  */
object OperatorsMethodCall {
  def main(args: Array[String]): Unit = {

    val sum = 4 + 10
    println(sum)

    val sums = 4.+(10)
    println(sums)

    val temp = "hello".charAt(0)
    println(temp)

    val newTemp = "hello" charAt 0
    print(newTemp)
  }

}
