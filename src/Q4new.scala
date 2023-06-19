import scala.io.StdIn._
object Q4new extends App{
  val currentPrice = 15.00
  val currentAttendence = 120
  val change = 4 //if increase or decrease rs.1 4 attendence decrease or increase
  val performaceCost = 500.00
  val attendeeCost = 3.00

  var changingPrice = readLine("Enter the changing ticket value: ").toInt
  var typeChange = readLine("Enter the type decrease or increase: ").toLowerCase()

  def income(attendance: Int, price: Double):Double={
    price*attendance
  }

  def cost(attendance: Int): Double = {
    performaceCost+(attendeeCost*attendance)
  }

  def profit(x:Int,y:String):Double= {
    if (y == "increase") {
      income((currentAttendence - (x * change)), (currentPrice + x)) - cost((currentAttendence - (x * change)))
    }
    else {
      income(((x * change) + currentAttendence), (currentPrice - x)) - cost(((x * change) + currentAttendence))
    }
  }

  println("The profit is "+ profit(changingPrice,typeChange))





}