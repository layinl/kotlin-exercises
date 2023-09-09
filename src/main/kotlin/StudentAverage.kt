fun main() {
    val studentAverage = readLine()!!.toDouble()
    when {
        studentAverage < 5 -> println("REP")
        studentAverage >= 5 && studentAverage < 7 -> println("REC")
        studentAverage >= 7 -> println("APR")
    }
}