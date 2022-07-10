object Main {
  def main(args: Array[String]): Unit = {
    println("Salary = "+ finalSalary(40,30))

  }

  def workingH(h:Int): Int = {
    return h * 250;
  }
  def OTH(h:Int):Int = {
    return h * 85
  }
  def Income(x:Int, y:Int): Int = {
    return workingH(x) + OTH(y)
  }
  def Tax(income:Int): Double = {
    return income * (12/100);
  }
  def finalSalary(x:Int, y:Int): Double = {
    return Income(x,y) - Tax(Income(x,y))

  }
}