package ChallengeQuestions

/**
  * Created by Adwiti on 6/19/2018.
  */
object IsLeapYear {

  def main(args: Array[String]): Unit = {
    print(isLeapYear(3000))
  }

  def isLeapYear(year: Int): Boolean = {
    if (year > 9999 || year < 1) {
      return false
    }
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      return true
    }
    return false
  }
}
