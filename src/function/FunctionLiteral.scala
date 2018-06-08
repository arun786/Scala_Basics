package function

/**
  * Created by Adwiti on 6/7/2018.
  */
object FunctionLiteral {

  def max(x: Int, y: Int): Int = if (x > y) x else y

  def main(args: Array[String]): Unit = {
    val number = max(10, 12)
    print(number)
  }
}
