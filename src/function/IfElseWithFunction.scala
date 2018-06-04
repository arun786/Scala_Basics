package function

/**
  * Created by Adwiti on 6/4/2018.
  */
object IfElseWithFunction {

  def max(x: Int, y: Int): Int = {
    if (x > y) x else y
  }

  def main(args: Array[String]): Unit = {
    print(max(3, 4))
  }
}
