object Main extends App {

  /**
    * O(N)
    */
  def basicAlgo(til: Int): Int = {
    if (til <= 0) throw new InputException()
    else (1 until til).filter {x => (x % 3 == 0) || (x % 5 == 0)}.sum
  }
  println(basicAlgo(1000))

 def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0)*0.000000001 + "s")
    result
  }

  time {
    /**
      * O(1)
      */
    def bestAlgo(til: Int): Int = {
      ((3*((til-1)/3)*(((til-1)/3)+1))/2) + ((5*((til-1)/5)*(((til-1)/5)+1))/2) - ((15*((til-1)/15)*(((til-1)/15)+1))/2)
    }

    println(bestAlgo(1000))
  }
