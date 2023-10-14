fun main() {
  val countryA = Pais(readLine()!!.toDouble(), growthRate = 0.03)
  val countryB = Pais(readLine()!!.toDouble(), growthRate = 0.015)

  var years = 0
  while (countryA.inhabitants < countryB.inhabitants) {
    countryA.increaseYearlyPopulation()
    countryB.increaseYearlyPopulation()
    years++
  }

  println("$years anos")
}

data class Country(var inhabitants: Double, val growthRate: Double) {
  fun increaseYearlyPopulation() {
    inhabitants *= 1 + growthRate
  }
}
