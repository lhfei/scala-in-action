package cn.lhfei.scala.tour.abstracttypes

/**
 * Created by lhfei on 12/19/14.
 */
abstract class SeqBuffer extends Buffer {
  type U
  type T <: Seq[U]

  def length = element.length
}
