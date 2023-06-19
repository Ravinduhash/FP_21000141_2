import scala.io.StdIn._

object Q4 extends App{
  val currentPrice = 15.00
  val currentAttendence = 120
  val change = 4 //if increase or decrease rs.1 4 attendence decrease or increase
  val performaceCost = 500.00
  val attendeeCost = 3.00
  var profits = Array(0.0)

  //  var changingPrice = readLine("Enter the changing ticket value: ").toInt
  //  var typeChange = readLine("Enter the type decrease or increase: ").toLowerCase()

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
  var x = 0
  while((currentAttendence-x*change)>0){
    profits = profits :+ profit(x,"increment")
    println(x+"--"+(currentAttendence-x*change))
    x= x+5
  }
  for(i<-profits){
    println(i)
  }
  x=0
  while ((currentPrice - x) > 0) {
    profits = profits :+ profit(x, "decrement")
    println(x + "--" + (currentPrice - x))
    x = x + 5
  }
  for (i <- profits) {
    println(i)
  }
  var max = 0.0
  for (i <- 1 to (profits.length - 1)) {
    if (profits(i) > max) max = profits(i);
  }
  println("The maximum profit is Rs."+ max+".\nThe ticket price is ")




}

