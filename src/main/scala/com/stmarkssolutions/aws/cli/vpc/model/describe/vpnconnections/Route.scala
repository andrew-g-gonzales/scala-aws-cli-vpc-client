package com.stmarkssolutions.aws.cli.vpc.model.describe.vpnconnections

case class Route(DestinationCidrBlock :String,
                 Source:String,
                 State:String)
