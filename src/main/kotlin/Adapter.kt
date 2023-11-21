/**
 * This conversion class only supports US Dollar to Pound Sterling
 * conversion
 *
 * **Note**: The rate is not up-to-date
 */
class OldCurrencyConverter {

  /**
   * Converts USD to GBP
   *
   * 1 USD = 0.8 GBP
   * @param amount the amount of dollars to be converted
   * @return the proportional value in GBP
   */
  fun convertUSDtoGBP(amount: Double): Double {
    return amount * 0.80
  }

}

/**
 * This class adapts the [OldCurrencyConverter] to apply the additional
 * interest of Pound Sterling-Euro conversion
 *
 * **Note**: The rate is not up-to-date
 * @see OldCurrencyConverter
 */
class CurrencyAdapter(private val oldConverter: OldCurrencyConverter) {

  /**
   * Converts USD to EUR using the [OldCurrencyConverter.convertUSDtoGBP]
   * method
   *
   * _10000 USD = 8500 EUR_
   * @param amount the amount of dollars to be converted
   * @return the proportional value in Euro deducted by the exchange interest
   * @see OldCurrencyConverter.convertUSDtoGBP
   */
  fun convertUSDtoEUR(amount: Double): Double {
    return oldConverter.convertUSDtoGBP(amount) * 1.0625
  }

}

fun main() {
  println("Please input the amount of USD to convert to EUR")
  val input = readLine()?.toDoubleOrNull() ?: return
  println("USD: $input\nEUR: ${CurrencyAdapter(OldCurrencyConverter()).convertUSDtoEUR(input)}")
}