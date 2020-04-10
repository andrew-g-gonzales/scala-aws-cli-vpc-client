package com.stmarkssolutions.aws.cli.vpc.model.describe.flowlogs

case class FlowLog(CreationTime:String,
                   DeliverLogsErrorMessage:Option[String],
                   DeliverLogsPermissionArn:Option[String],
                   DeliverLogsStatus:String,
                   FlowLogId:String,
                   FlowLogStatus:String,
                   LogGroupName:Option[String],
                   ResourceId:String,
                   TrafficType:String,
                   LogDestinationType:String,
                   LogDestination:Option[String],
                   LogFormat:Option[String])
