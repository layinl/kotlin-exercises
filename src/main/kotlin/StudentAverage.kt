/**
 * ## Student Average Program
 *
 * This program gets the student's average in a 0-10 scale and outputs if
 * he **failed**, needs **Grade Recovery** or **Passed**, based on Brazil's
 * Ministry of Education grade system (...sort of).
 * @throws NumberFormatException if the value is Not a Number
 */
fun main() {
  try {
    println("From 0 to 10, what is the student average?")
    val studentAverage = readLine()!!.toDouble()
    println(
      when {
        studentAverage in 0.0..4.9 -> "FAILED"
        studentAverage < 7 -> "GRADE RECOVERY"
        studentAverage in 7.0..10.0 -> "PASSED"
        else -> "Invalid value"
      }
    )
  } catch (e: NumberFormatException) {
    println("Please input a number")
    e.printStackTrace()
  }
}