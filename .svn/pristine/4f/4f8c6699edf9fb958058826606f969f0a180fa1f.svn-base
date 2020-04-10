package com.stmarkssolutions.aws.cli.vpc.client

import com.stmarkssolutions.aws.cli.vpc.util.StringUtil._
import com.stmarkssolutions.aws.cli.vpc.util.GeneralUtil._

import scala.sys.process._
import scala.sys.SystemProperties
import scala.sys.process.Process

object AwsCliS3ApiClient {

  def invokeCLICommand(commandToExecute:String): (Option[String],Option[String],Int) ={

    val (out, err) = (new StringBuffer(), new StringBuffer())
    val logger = ProcessLogger(
      out.append(_),
      err.append(_)
    )

    println(s"before:  time(Process(commandToExecute).lineStream_!.!!)")
    val result = time(Process(commandToExecute).!(logger))
    println(s"after:  time(Process(commandToExecute).lineStream_!.!!)")
    println(s"result: ${result}")

    val (jsonContent,e) = (out.toString,err.toString)
    val error = err.toString

    val optError = stringIsBlank(Option(error)) match {
      case true=>None
      case false=>{
        Option(error)
      }
    }

    (Option(jsonContent),optError ,result)
  }

}
