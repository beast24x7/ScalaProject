import org.scalatest.funsuite.AnyFunSuite

class RunCounterSpec extends AnyFunSuite
{
  val string1 = "i am a test string string i"
  val string2 = " "
  val expectedOp = Map("i" -> 2, "am" -> 1, "a" -> 1, "test" -> 1, "string" -> 2 )
  val expectedOp1 = Map()
  val Runc = RunCounter

  test("count the number of counts for words in a string"){
    assert(Runc.wordsCount(string1) == expectedOp)
  }
  test("count the number if empty string"){
    assert(Runc.wordsCount(string2) == expectedOp1)
  }
}
