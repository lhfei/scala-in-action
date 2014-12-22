package cn.lhfei.scala.tour.classes

/**
 * Created by lhfei on 12/21/14.
 */
object Classes {

  def main (args: Array[String]) {
    var pt = new Point(1, 2)

    println(pt)

    pt.move(10, 10)

    println(pt)
  }
}
