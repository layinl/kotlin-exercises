package builder

/**
 * The
 */
fun main() {
  println("Please input the client's name")
  val customerName = readLine() ?: ""
  val orderBuilder = CustomOrder.Builder().setCustomerName(customerName)

  println("How many products will it be?")
  val numProducts = readLine()?.toIntOrNull() ?: 0
  for (i in 1..numProducts) {
    println("Plaese input the item's name")
    val productName = readLine() ?: ""
    println("Plaese input the item's price")
    val productPrice = readLine()?.toDoubleOrNull() ?: 0.0
    println("Plaese input the item's quantity")
    val productQuantity = readLine()?.toIntOrNull() ?: 0
    orderBuilder.addProduct(Product(productName, productPrice, productQuantity))
  }

  println("What is the delivery address?")
  val deliveryAddress = readLine() ?: ""
  val customOrder = orderBuilder.setDeliveryAddress(deliveryAddress).build()
  customOrder.printReceipt()
}