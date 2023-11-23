fun main() {
  println("Insira uma data (dd/mm/aaaa)")
  val date: String? = readLine()
  val (day, month, year) = date!!.split("/")

  val fullMonth = when (month.toInt()){
    1 -> "Janeiro"
    2 -> "Fevereiro"
    3 -> "Março"
    4 -> "Abril"
    5 -> "Maio"
    6 -> "Junho"
    7 -> "Julho"
    8 -> "Agosto"
    9 -> "Setembro"
    10 -> "Outubro"
    11 -> "Novembro"
    12 -> "Dezembro"
    else -> "Mês inválido"
  }

  println("$day de $fullMonth de $year")
}
