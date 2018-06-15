object Main extends App {
  /**
    * Generates prime numbers using Sieve of Eratosthenes.
    */
  def generateEratosthenesPrimes(til: Int): List[Int] =
    Try(generateEratosthenesPrimesLogic(Stream.from(2)).take(til)) match {
      case Success(something) => something.toList
      case Failure(ex) => throw new InputException(ex.toString)
    }

  /**
    * Sub-function for generateEratosthenesPrimes
    */
  private def generateEratosthenesPrimesLogic(input: Stream[Int]): Stream[Int] =
    input.head #:: generateEratosthenesPrimesLogic(input.tail.filter(_ % input.head != 0))

  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0)*0.000000001 + "s")
    result
  }

  time {
    /**
      * Improved algorithm, has O(n*log(n)) complexity.
      */
    val maxPrime = 10000.generateEratosthenesPrimes.filter(x => x < 2000000).sum

    print(maxPrime)
  }
}
