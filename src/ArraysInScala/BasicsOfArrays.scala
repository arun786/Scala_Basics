package ArraysInScala

/**
  * Created by Adwiti on 6/13/2018.
  */
object BasicsOfArrays {
  def main(args: Array[String]): Unit = {
    var names = new Array[String](3)
    names(0) = "arun"
    names(1) = "sachin"
    names(2) = "rahul"

    for (i <- 0 to names.size - 1)
      println(names(i))
  }
}
