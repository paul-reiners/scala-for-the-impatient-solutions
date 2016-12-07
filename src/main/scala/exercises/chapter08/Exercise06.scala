package chapter08

abstract class Shape() {
  def centerPoint: (Double, Double)
}

class Rectangle(upperLeft: (Double, Double), lowerRight: (Double, Double)) extends Shape() {
  def centerPoint = ((upperLeft._1 + lowerRight._1) / 2.0, (upperLeft._2 + lowerRight._2) / 2.0) 
}

class Circle(center: (Double, Double), radius: Double) {
  def centerPoint = center
}

object Exercise06 {
  def main(args: Array[String]) {
    val rectangle = new Rectangle((0, 0), (1, 2))
    println(rectangle.centerPoint)
    val circle = new Circle((0, 0), 1.0)
    println(circle.centerPoint)
  }
}
