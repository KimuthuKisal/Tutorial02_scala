object Main {
  def main(args: Array[String]): Unit = {
    val Profit = profit(25)
    println("Highest Profit = "+ Profit);
    println("Best Ticket Price = " + 25);

  }
  def Attendees(x:Int) : Int = {
    return 120 + (15-x)/5*20
  }
  def Revenue(x:Int):Int = {
    return Attendees(x) * x
  }

  def Cost(x:Int):Int = {
    return 500 + 3 * Attendees(x)
  }

  def profit(x:Int):Int = {
    return Revenue(x) - Cost(x)
  }


}