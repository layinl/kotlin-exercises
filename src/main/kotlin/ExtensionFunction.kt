import java.util.*

/**
 * This program receives a book and its author and outputs it as a slug,
 * a machine and human legible text format.
 */
fun main() {
  println("Please input the book title")
  val title = readLine() ?: ""
  println("Please input the book's author")
  val author = readLine() ?: ""
  println("Generated slug for the book:\n" +
    "${title.generateSlug()}_${author.generateSlug()}"
  )
}

/**
 * Generates a slug from the String, like:
 * generates-a-slug-from-the-string-like
 * @return the same string in the slug format
 */
fun String.generateSlug(): String {
  return this
    .lowercase(Locale.getDefault())
    .replace(".", "")
    .replace(' ', '-', )
}
