import scala.io.StdIn._
object Q3 extends App {
  var normal:Int = readLine("Please Enter working hours: ").toInt
  var ot: Int = readLine("Please Enter OT hours: ").toInt

  def salary(n:Int, ot:Int):Double={
    ((250.00*n)+(85.00*ot))
  }
  def calTax(sal:Double):Double={
    sal*0.12
  }
  def Tax(sal:Double):Double={
    if(sal<12550){
      sal
    }
    else {
      sal-calTax(sal)
    }
  }

  println("Your take home salary is "+Tax(salary(normal,ot)))



}
