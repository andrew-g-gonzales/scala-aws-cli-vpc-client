package com.stmarkssolutions.aws.cli.vpc.model.describe.vpnconnections

import com.stmarkssolutions.aws.cli.vpc.model.response.Tag

case class VpnConnection(CustomerGatewayConfiguration:String,
                         CustomerGatewayId :String,
                         Category:String,
                         State:String,
                         Type:String,
                         VpnConnectionId:String,
                         VpnGatewayId:String,
                         TransitGatewayId:Option[String],
                         TunnelOption:scala.Option[TunnelOption],
                         Routes:List[Route],
                         Tags:List[Tag],
                         VgwTelemetry:Option[List[VgwTelemetry]]
                        )
