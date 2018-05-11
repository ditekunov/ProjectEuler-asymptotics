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
}
