package chapter08

class Square(cornerPoint: (Int, Int), width: Int) extends java.awt.Rectangle(cornerPoint._1, cornerPoint._2, width, 0) {
  def this(width: Int) = this((0, 0), width)
  def this() = this(0)
}


object Exercise07 {
  def main(args: Array[String]) {
    val square1 = new Square((1, 2), 3)
    println(square1)
    val square2 = new Square(4)
    println(square2)
    val square3 = new Square()
    println(square3)
  }
}
