package loops

/**
  * Created by Adwiti on 6/4/2018.
  */
object WhileLoop {

  def main(args: Array[String]): Unit = {
    /**
      * var is non final, val is final
      */
    var i = 0;
    while (i < 3) {
      println("i : " + i)
      i = i + 1
    }
  }
}
