package builder

/**
 * The CustomOrder class manages the customer's order
 * It may only generate objects through the [Builder.build] function
 * @see Builder
 * @property customerName The customer's... name
 * @property products The list of the order's products
 * @see Product
 * @property total The order's total price
 * @property deliveryAddress The designated delivery address
 * @constructor Generates the order
 */
class CustomOrder private constructor(
  private val customerName: String,
  private val products: List<Product>,
  private val total: Double,
  private val deliveryAddress: String
) {
  /**
   * This class generates the [CustomOrder]'s objects based on its properties
   * @see CustomOrder
   * @property customerName The customer's... name
   * @property products The list of the order's products
   * @see Product
   * @property deliveryAddress The designated delivery address
   */
  class Builder {
    private var customerName: String = ""
    private var products: MutableList<Product> = mutableListOf()
    private var deliveryAddress: String = ""

    /**
     * Sets the customer's name
     * @param name the customer's name to set
     * @return The [Builder] object
     */
    fun setCustomerName(name: String) = apply { customerName = name }
    /**
     * Adds the product to the order's list
     * @param product the item to be added in the order
     * @see Product
     * @return The [Builder] object
     */
    fun addProduct(product: Product) = apply { products.add(product) }
    /**
     * Sets the order's delivery address
     * @param address the order's delivery address
     * @return The [Builder] object
     */
    fun setDeliveryAddress(address: String) = apply { deliveryAddress = address }

    /**
     * Builds the [CustomOrder] based on this class' properties
     * @return the new CustomOrder
     * @see CustomOrder
     */
    fun build(): CustomOrder {
      return CustomOrder(
        customerName,
        products,
        products.map { product -> product.price * product.quantity }.reduce { acc, price -> acc + price },
        deliveryAddress
      )
    }
  }

  /**
   * Prints the receipt, containing:
   * - Customer's name
   * - Each item's info
   * - Order's total value
   * - Delivery's address
   */
  fun printReceipt() {
    println("${this.customerName}\n" +
      this.products.mapIndexed {
          index, product -> "${index + 1}. ${product.name} | ${product.price} | ${product.quantity}\n"
      }
        .reduce { acc, item -> acc + item } +
      "Total: ${this.total}\n" +
      "Address: ${this.deliveryAddress}"
    )
  }
}