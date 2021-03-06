import scala.annotation.tailrec

object Main extends App {

  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0)*0.000000001 + "s")
    result
  }

  time {
    /**
      * Basic algorithm with O(n) speed
      */
    def basicAlgo(until: Int = 4000000) = {
      @tailrec
      def fibonacciRecursion(listOfFibs: List[Int] = List(), first: Int = 1, second: Int = 1): List[Int] = {
        if (second >= until) listOfFibs
        else if (second % 2 == 0) fibonacciRecursion(listOfFibs :+ second, second, first + second)
        else fibonacciRecursion(listOfFibs, second, first + second)
      }
      fibonacciRecursion()
    }

    println(basicAlgo().sum)
  }


}
