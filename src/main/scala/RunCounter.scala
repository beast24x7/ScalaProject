object RunCounter {
  def wordsCount(line: String): Map[String, Int] = {
    line.split(" ").map(v => (v, 1)).groupBy(_._1).mapValues(_.size)
  }

  def main(args: Array[String]) {
    println(wordsCount("hello my name is ravi").toString())
  }
}
