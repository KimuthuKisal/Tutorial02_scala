object Main {
  def main(args: Array[String]): Unit = {
    println("Final Salary = "+ finalSalary(40,30));
  }

  def workingH(h:Int): Int = {
    return h * 250;
  }
  def OTH(h:Int):Int = {
    return h * 85
  }
  def Income(h1:Int, h2:Int): Int = {
    return workingH(h1) + OTH(h2)
  }
  def Tax(income:Int): Double = {
    return income * (12.0/100.0);
  }
  def finalSalary(x:Int, y:Int): Double = {
    return Income(x,y) - Tax(Income(x,y))
  }


}