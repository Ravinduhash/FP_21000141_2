object Q2 extends App {
  var a :Int = 2
  var b :Int = 3
  var c :Int = 4
  var d :Int = 5
  var k :Float = 4.3f

//  println((--b) * a + c * (d--))       ---------    --b and d-- not a valid operations of the scala program
  b -= 1
  println((b) * a + c * (d))
  d -= 1

  //println(a++)       ---------    a++ is not a valid operation of the scala program
  println(a)
  a+=1

//  println(–2 * (g–k) +c)       ---------    there is no variable as g and the prefixes not working in scala (-k)
  println((-2) * (-1*k) +c)

//  println (c=c++)       ---------    postfixes not working in scala and the operations can't do in println
  println(c);
  c+=1

//  println(c =++ c * a ++);
  c+=1
  println(c*a)
  a+=1
}
