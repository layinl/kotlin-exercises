import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*



/*
 * Complete the 'getOriginalArray' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY pref as parameter.
 */

fun getOriginalArray(pref: Array<Int>): Array<Int> {
  // Write your code here
  val arr: Array<Int> = pref
  for(num in 1 until pref.size) {
    val res = arr[num-1] xor arr[num]
    arr[num] = res
  }
  return arr
}

/**
 * # What the hell this code does again?
 * @see getOriginalArray
 */
fun main(args: Array<String>) {
  val prefCount = readLine()!!.trim().toInt()

  val pref = Array(prefCount) { 0 }
  for (i in 0 until prefCount) {
         val prefItem = readLine()!!.trim().toInt()
         pref[i] = prefItem
     }
  //val pref = intArrayOf(2, 2, 5, 6)

  val result = getOriginalArray(pref)

  println(result.joinToString("\n"))
}