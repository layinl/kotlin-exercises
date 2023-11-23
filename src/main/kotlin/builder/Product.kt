package builder

/**
 * The Product class represents each order's item
 * @see CustomOrder
 * @property name The product's name or title
 * @property price The product's full price
 * @property quantity How many of this product will be in the order
 * @constructor Creates a product
 */
class Product(val name: String, val price: Double, val quantity: Int)