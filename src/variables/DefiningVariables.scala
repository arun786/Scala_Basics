package variables

/**
  * Created by Adwiti on 5/19/2018.
  */
object DefiningVariables {

  def main(args: Array[String]): Unit = {

    val msg = "Hello World" // val is final and cannot be reassigned
    println(msg)

    var nonFinal = "hello world" //var is non final
    println(nonFinal)

    nonFinal = "hello"
    println(nonFinal)
  }

}
