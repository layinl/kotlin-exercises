/**
 *  Gets the number input and prints its equivalent roman numeral.
 *  Not final version. It needs some testing. 
 */
fun main() {
  // TODO: Create some tests to validate
  val romanNum: String? = readLine()
  val romanNums = mapOf(
    'I' to 1,
    'V' to 5,
    'X' to 10,
    'L' to 50,
    'C' to 100,
    'D' to 500,
    'M' to 1000
  )
  var result = 0

  for(i in romanNum!!.indices) {
    val digit = romanNums.getValue(romanNum[i])
    val nextDigit = when(i + 1) {
      romanNum.length -> 0
      else -> romanNums.getValue(romanNum[i+1])
    }
    result = if(digit >= nextDigit) result + digit else result - digit
  }

  println(result)
}
