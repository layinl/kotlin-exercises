fun main() {
  try {
    println("From 0 to 10, what is the student average?")
    val studentAverage = readLine()!!.toDouble()
    println(
      when {
        studentAverage in 0.0..4.9 -> "FAIL"
        studentAverage < 7 -> "REC"
        studentAverage in 7.0..10.0 -> "APR"
        else -> "Invalid value"
      }
    )
  } catch (e: NumberFormatException) {
    println("Please input a number")
    e.printStackTrace()
  }
}