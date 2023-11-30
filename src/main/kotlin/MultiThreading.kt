/**
 * This program receives URLs via user input and simulates its
 * downloading, printing the total time elapsed in the end.
 *
 * This program was made to learn about Multithreading
 */
fun main() {
  val urls = mutableListOf<String>()

  println("Please input a url. Leave blank to finish and print")
  while (true) {
    val input = readLine() ?: break
    if (input.isBlank()) break
    urls.add(input)
    println("Please input the next one")
  }

  val results = mutableListOf<Pair<Int, Int>>()

  val threads = urls.mapIndexed { index, url ->
    Thread {
      val length = openLink(url)
      synchronized(results) {
        results.add(Pair(index, length))
      }
    }
  }
  threads.forEach { it.start() }

  println(
    results
      .sortedBy { it.first }
      .mapIndexed { idx, result -> "File ${ idx + 1 }: ${ result.second }\n" }
      .reduce { acc, item -> acc + item } +
    "Total time: ${urls.size}"
  )
}

/**
 * Receives a URL and returns a simulated time elapsed to open/download
 * @param url the URL to be calculated
 * @return the time for the URL (URL's length for now)
 */
fun openLink(url: String): Int {
  return url.length
}