package chapter08

class Point(x: Double, y: Double)

class LabeledPoint(label: String, x: Double, y: Double) extends Point(x, y)

object Exercise05 {
  def main(args: Array[String]) {
    val point = new LabeledPoint("Black Thursday", 1929, 23007)
    println(point)
  }
}