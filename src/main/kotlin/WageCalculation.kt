fun main() {
  val salary = readLine()!!.toDouble()
  val benefits = readLine()!!.toDouble()

  println(String.format("%.2f", salary - calculateTaxes(salary) + benefits))
}

fun calculateTaxes(salary: Double): Double {
  val aliquot = when {
    (salary <= 1100) -> 0.05
    (salary <= 2500) -> 0.1
    else -> 0.15
  }
  return salary * aliquot
}