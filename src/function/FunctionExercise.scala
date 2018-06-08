package function

/**
  * Created by Adwiti on 6/7/2018.
  */
object FunctionExercise {

  def printName(name: String, i: Int): Unit = {
    var j = 0;
    while (j < i) {
      println(j + ":" + name)
      j = j + 1
    }
  }

  def main(args: Array[String]): Unit = {
    printName("arun", 10)
  }

}
