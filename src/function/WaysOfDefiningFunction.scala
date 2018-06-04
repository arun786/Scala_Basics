package function

/**
  * Created by Adwiti on 6/4/2018.
  */
object WaysOfDefiningFunction {

  def main(args: Array[String]): Unit = {
    println(max(4, 5))
    println(maxOneLiner(4, 5))
    print(f(10))
  }

  /**
    * First way to define a function
    *
    * @param x
    * @param y
    * @return
    */
  def max(x: Int, y: Int): Int = {
    if (x > y) x else y
  }

  /**
    * one liner
    */
  def maxOneLiner(x: Int, y: Int) = if (x > y) x else y;


  /**
    * define a function which will add 1 to value passed
    *
    * @param x
    * @return
    */
  def f(x: Int) = x + 1
}
