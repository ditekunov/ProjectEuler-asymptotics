object Main extends App {

  /**
    * Basic algo with O(N) complexity
    */
  def factors(n:Long):List[Long] = {
    def divides(d:Long, n:Long) = (n % d) == 0
    def ld(n:Long):Long =  ldf(2, n)
    def ldf(k:Long, n:Long):Long = {
      if (divides(k, n)) k
      else if ((k*k) > n) n
      else ldf((k+1), n)
    }
    n match {
      case 1 => Nil
      case _ => val p = ld(n); p :: factors(n / p)
    }
  }

  factors(600851475143L).max

  println(factors(600851475143L).max)
  
  
  /**
    * Generates prime numbers using Sieve of Eratosthenes.
    */
  def generateEratosthenesPrimes: List[Int] =
    Try(generateEratosthenesPrimesLogic(Stream.from(2)).take(til)) match {
      case Success(something) => something.toList
      case Failure(ex) => throw new InputException(ex.toString)
    }

  /**
    * Sub-function for generateEratosthenesPrimes
    */
  private def generateEratosthenesPrimesLogic(input: Stream[Int]): Stream[Int] =
    input.head #:: generateEratosthenesPrimesLogic(input.tail.filter(_ % input.head != 0))

  /**
   * Improved algorithm, has O(n*log(n)) complexity.
   */
  val maxPrime = 5000.generateEratosthenesPrimes.filter { x =>
    600851475143L % x == 0
  }.max

  
  print(maxPrime)
}
