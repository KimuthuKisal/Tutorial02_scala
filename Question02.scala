object Main {
  def main(args: Array[String]): Unit = {
    var a: Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5
    var k: Float = 4.3f
    var g: Float = 4.0f

    b-=1 //--b
    println(b*a+c*d)
    d-=1 //d--

    println(a)
    a+=1 //a++

    println(-2 * (g-k)+c)

    println(c)
    c+=1 //c++

    c+=1 //++c
    println(c*a)
    a+=1  //a++
  }
}