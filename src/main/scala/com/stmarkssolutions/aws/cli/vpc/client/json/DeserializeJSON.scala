package com.stmarkssolutions.aws.cli.vpc.client.json

object DeserializeJSON {

  def deserialize[T](jsonRequest: String)(implicit m: Manifest[T]): T = {
    implicit val formats = net.liftweb.json.DefaultFormats
    val jsonData = net.liftweb.json.parse(jsonRequest).extract[T]
    jsonData
  }
}
