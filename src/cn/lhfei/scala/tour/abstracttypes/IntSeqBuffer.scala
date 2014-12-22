package cn.lhfei.scala.tour.abstracttypes

/**
 * Created by lhfei on 12/19/14.
 */
abstract class IntSeqBuffer extends SeqBuffer {
  type U = Int
}

object AbstractTypeTest1 extends App {

  def newIntSeqBuf(elem1:Int, elem2:Int): IntSeqBuffer =

    new IntSeqBuffer {
      override type T = List[U]
      override val element = List(elem1, elem2)
    }
  val buf = newIntSeqBuf(7, 8)

  println("Length = " +buf.length)
  println("Content = " +buf.element)
}
