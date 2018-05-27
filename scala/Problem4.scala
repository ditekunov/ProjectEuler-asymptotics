object Main extends App {

  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0)*0.000000001 + "s")
    result
  }

//O(n^2)
  time {
    def palindrome (value: String) =
      value.substring(0, value.length/2) == value.substring(value.length/2).reverse
    def answer = (for (a <- 100 until 999 ; b <- 100 until 999
                       if palindrome(a * b toString))
      yield a*b).max

    print(answer)
  }


}
