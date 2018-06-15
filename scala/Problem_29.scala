object Main extends App {

  //O(n^2)
  def task = (for (a <- 2 until 101; b <- 2 until 101) yield BigInt(a).pow(b)).distinct.length
  
  print(task)
}
