object Main extends App {

//O(1) improved solution
  val sm: Int = 100 * (100+1)/ 2
  val squared: Int = (100 * (100 + 1) * (2 * 100 + 1)) / 6

  val result: Int = sm * sm - squared
 
  println(result)

}
