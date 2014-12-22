package cn.lhfei.scala.tour.annotations

import java.io.{FileReader, BufferedReader, IOException}

/**
 * Created by lhfei on 12/19/14.
 */
class Reader(fname: String) {

  private val in = new BufferedReader(new FileReader(fname))

  @throws(classOf[IOException])
  def read() = in.read()

}
