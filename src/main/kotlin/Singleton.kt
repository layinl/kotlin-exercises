/**
 * This class represents the user, with [id] and his [name]
 * @property id User's ID
 * @property name User's name
 * @constructor Creates a User
 */
class User(val id: Int, val name: String)


/**
 * This singleton object can add and list the registered users
 */
object UserManager {

  private val users = mutableListOf<User>()
  private var identity = 1

  /**
   * Creates a user and adds it to the [users] list
   * @param name the user's name
   */
  fun addUser(name: String) {
    users.add(User(identity++, name))
  }

  /**
   * Prints all users in a list
   */
  fun listUsers() {
    users.forEach { user -> println("${user.id} - ${user.name}") }
  }
}

fun main() {
  val quantity = readLine()?.toIntOrNull() ?: 0
  for (i in 1..quantity) {
    val name = readLine() ?: ""
    UserManager.addUser(name)
  }
  UserManager.listUsers()
}