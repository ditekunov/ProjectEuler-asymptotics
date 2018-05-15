object Main extends App {

  val list_of_nums = rawString.toList.map(_.toString.toInt)

  //print(list_of_nums)

// O(N) solution.
  def findMax(maxProd: Long = 0, i: Int = 12): Long = {
    if (i >= list_of_nums.length) maxProd
    else if (list_of_nums(i) * list_of_nums(i - 1) * list_of_nums(i - 2) * list_of_nums(i - 3) *
      list_of_nums(i - 4) * list_of_nums(i - 5) * list_of_nums(i - 6) * list_of_nums(i - 7) *
      list_of_nums(i - 8) * list_of_nums(i - 9) * list_of_nums(i - 10) * list_of_nums(i - 11) *
      list_of_nums(i - 12) > maxProd) findMax(list_of_nums(i) * list_of_nums(i - 1) * list_of_nums(i - 2) * list_of_nums(i - 3) *
      list_of_nums(i - 4) * list_of_nums(i - 5) * list_of_nums(i - 6) * list_of_nums(i - 7) *
      list_of_nums(i - 8) * list_of_nums(i - 9) * list_of_nums(i - 10) * list_of_nums(i - 11) *
      list_of_nums(i - 12), i + 1)
    else findMax(maxProd, i + 1)
  }

  print(findMax())


}
