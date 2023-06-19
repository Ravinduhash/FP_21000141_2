import scala.math._
object Q1 extends App{
  var i,j,k :Int = 2
  var m, n: Int = 5
  var f  = 12.0f
  var g = 4.0f
  var c:Char = 'X'

  def A(): Int ={
    k+12*m
  }
  def B(): Double = {
    m/j
  }
  def C(): Int = {
    n%j
  }

  def D(): Double = {
    m/j*j
  }

  def E(): Float = { //use float to get output. char or Unit not working
    f + 10*5 +g
  }

  def F(): Int = {
    (i+1) * n    //++ is use to concatenate two lists, sets or arrays
  }
//  println(i,m,n,j,k,f,g,c)
  println("Answer for a) is "+A())
  println("Answer for b) is "+B())
  println("Answer for c) is "+C())
  println("Answer for d) is "+D())
  println("Answer for e) is "+E())
  println("Answer for f) is "+F())

}
