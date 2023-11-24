package growthrate

/**
 * The Country class represents a country by its [inhabitants] and
 * [Growth Rate][growthRate]
 * @property inhabitants the number of inhabitants of the country
 * @property growthRate the country's growth rate
 * @constructor creates a new country
 */
data class Country(var inhabitants: Double, val growthRate: Double) {

  /**
   * Increases the country's population by its [growthRate]%
   */
  fun increaseYearlyPopulation() {
    inhabitants *= 1 + growthRate
  }

}