package Exercises

/**
  * Created by Adwiti on 6/13/2018.
  */
object _1_FunctionPrint {

  def main(args: Array[String]): Unit = {
    printString("arun", 10)
  }

  def printString(name: String, number: Int): Unit = {
    var index = 0;
    while (index < number) {
      println(index + ":" + name)
      index = index + 1
    }
  }
}
