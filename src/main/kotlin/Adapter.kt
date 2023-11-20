/**
 * This conversion class only supports US Dollar to Pound Sterling
 * conversion
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
 * @see OldCurrencyConverter
 */
class CurrencyAdapter(private val oldConverter: OldCurrencyConverter) {

  /**
   * Converts USD to EUR using the [OldCurrencyConverter.convertUSDtoGBP] method
   *
   * _10000 USD = 10625 EUR_
   * @param amount the amount of dollars to be converted
   * @return the proportional value in Euro
   * @see OldCurrencyConverter.convertUSDtoGBP
   */
  fun convertUSDtoEUR(amount: Double): Double {
    return oldConverter.convertUSDtoGBP(amount) * 1.0625
  }

}

fun main() {
  println("Please input the amount of USD to convert to EUR")
  val input = readLine()?.toDoubleOrNull() ?: return
  println("USD: $input \n EUR: ${CurrencyAdapter(OldCurrencyConverter()).convertUSDtoEUR(input)}")
}