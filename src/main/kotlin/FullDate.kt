/**
 * The Full Date program gets the date and prints its full date.
 *
 * e.g. 11/24/1947 -> **November 24th, 1947**
 *
 */
fun main() {
  println("Please input a date (mm/dd/yyyy)")
  val date: String? = readLine()
  val (month, day, year) = date!!.split("/")

  val daySufix = when (day.toInt()) {
    1, 21, 31 -> "st"
    2, 22 -> "nd"
    3, 23 -> "rd"
    else -> "th"
  }
  
  val fullMonth = when (month.toInt()){
    1 -> "January"
    2 -> "February"
    3 -> "March"
    4 -> "April"
    5 -> "May"
    6 -> "June"
    7 -> "July"
    8 -> "August"
    9 -> "September"
    10 -> "October"
    11 -> "November"
    12 -> "December"
    else -> "Invalid month"
  }

  println("$fullMonth ${day + daySufix}, $year")
}
