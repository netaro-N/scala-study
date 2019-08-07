object SimpleSearch extends App {
  val text ="カワカドカドカドドワンゴカドカドンゴドワドワンゴドワカワカドンゴドワ".toSeq
  val pattern = "ドワンゴ".toSeq
  val matchIndexes = search(text, pattern)

  def search(text: Seq[Char], pattern: Seq[Char]): Seq[Int] = {
    var matchIndexes = Seq[Int]()
    for (i <- 0 to text.length - 1) {
      val partText = text.slice(i, i + pattern.length)
      println(partText)
    }
    matchIndexes
  }

  println(s"出現場所： ${matchIndexes}")
}