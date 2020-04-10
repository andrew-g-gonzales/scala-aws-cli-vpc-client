package com.stmarkssolutions.aws.cli.vpc.model.describe.routetables

case class Association(Main:Boolean,
                       RouteTableAssociationId:String,
                       RouteTableId:String,
                       SubnetId:Option[String],
                       GatewayId:Option[String],
                       AssociationState:Option[AssociationState]
                      )

case class AssociationState(State:Option[String],StatusMessage:Option[String])