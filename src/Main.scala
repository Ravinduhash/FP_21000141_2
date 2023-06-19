object Main {
  def main(args: Array[String]): Unit = {
    class MyGenericClass[T](value: T) {
      def getValue: T = value
    }

    // Usage
    val intInstance = new MyGenericClass[Int](42)
    println(intInstance.getValue) // Output: 42

    val stringInstance = new MyGenericClass[String]("Hello")
    println(stringInstance.getValue) // Output: Hello

  }
}