// O(n / (f(k))
object Main extends App {

  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0)*0.000000001 + "s")
    result
  }

  time {
    def problem5(cur: Int = 2 * 3 * 5 * 7 * 11 * 13 * 17 * 19): Int = {
      if (cur % 4 == 0 && cur % 6 == 0 && cur % 8 == 0 &&
        cur % 9 == 0 && cur % 10 == 0 && cur % 12 == 0 &&
        cur % 14 == 0 && cur % 15 == 0 && cur % 16 == 0 &&
        cur % 18 == 0 && cur % 20 == 0) cur
      else problem5(cur + 2 * 3 * 5 * 7 * 11 * 13 * 17 * 19)
    }
    print(problem5())
  }


}
