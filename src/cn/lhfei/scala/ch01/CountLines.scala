package cn.lhfei.scala.ch01

import scala.io.Source

/**
 * Created by lhfei on 12/19/14.
 */
object CountLines extends App{

  import System._

  val src = Source.fromFile("/home/lhfei/app_workspace/idea_workspace/app_spark/scala-in-action/src/cn/lhfei/scala/ch01/sampleFile.txt")

  val count = src.getLines().map(x => 1).sum

  println(count)
}
