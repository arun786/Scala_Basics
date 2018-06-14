package Exercises

/**
  * Created by Adwiti on 6/13/2018.
  */
object _1_Reverse_A_String {

  def main(args: Array[String]): Unit = {
    printStringInReverse("arun", "kumar", "singh")
  }

  def printStringInReverse(word1: String, word2: String, word3: String): Unit = {
    for (i <- word1.length - 1 to 0 by -1) {
      print(word1(i))
    }
    println()
    for (i <- word2.length - 1 to 0 by -1) {
      print(word2(i))
    }
    println()
    for (i <- word3.length - 1 to 0 by -1) {
      print(word3(i))
    }
  }
}
