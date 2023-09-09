fun main() {
  val date: String? = readLine()
  val (day, month, year) = date!!.split("/")

  val fullMonth = when (month.toInt()){
    1 -> "Janeiro"
    2 -> "Fevereiro"
    3 -> "Marco"
    4 -> "Abril"
    5 -> "Maio"
    6 -> "Junho"
    7 -> "Julho"
    8 -> "Agosto"
    9 -> "Setembro"
    10 -> "Outubro"
    11 -> "Novembro"
    12 -> "Dezembro"
    else -> "Mes invalido"
  }

  println("$day de $fullMonth de $year")
}