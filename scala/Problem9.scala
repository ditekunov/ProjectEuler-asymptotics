object Main extends App {
    
    //O(n^3)
    def task = 
      for {
      a <- 1 until 1000
      b <- a until 1000
      c <- b until 1000
      if a * a + b * b == c * c && a + b + c == 1000
    } yield a * b * c
  print(task.head)
}
