package com.stmarkssolutions.aws.cli.vpc.model.describe.securitygroups

case class IpRange(CidrIp:String,
                   Description:Option[String])