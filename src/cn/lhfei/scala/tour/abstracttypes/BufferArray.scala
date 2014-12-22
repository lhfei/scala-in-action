package cn.lhfei.scala.tour.abstracttypes

/**
 * Created by lhfei on 12/19/14.
 */
abstract class BufferArray[+T] {
 val element: T
}

abstract class SeqBufferArray[U, +T <: Seq[U]] extends BufferArray[T]{
  def length = element.length
}

object AbstractTypeTest2 extends App {

  def newIntSeqBuf(e1: Int, e2: Int): SeqBufferArray[Int, Seq[Int]] =
    new SeqBufferArray[Int, List[Int]] {
      val element = List(e1, e2)
    }

  val buf = newIntSeqBuf(8, 9)

  println("Length = " +buf.length)
  println("content = " +buf.element)

}
