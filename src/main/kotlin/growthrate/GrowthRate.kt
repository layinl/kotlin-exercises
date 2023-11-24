package growthrate

/**
 * This program receives two countries and calculate how many years
 * countryA's population would need to surpass countryB's population
 * @throws NumberFormatException if input value is Not A Number
 */
fun main() {
  println("Please insert CountryA's inhabitants")
  val countryA = Country(readLine()!!.toDouble(), growthRate = 0.2)
  println("Please insert CountryB's inhabitants")
  val countryB = Country(readLine()!!.toDouble(), growthRate = 0.1)

  var years = 0
  while (countryA.inhabitants < countryB.inhabitants) {
    countryA.increaseYearlyPopulation()
    countryB.increaseYearlyPopulation()
    years++
  }

  println("It will take $years years to CountryA's population surpass " +
    "CountryB's population")
}
