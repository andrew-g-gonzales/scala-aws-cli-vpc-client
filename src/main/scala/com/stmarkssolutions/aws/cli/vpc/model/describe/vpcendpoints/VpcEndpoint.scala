package com.stmarkssolutions.aws.cli.vpc.model.describe.vpcendpoints

import com.stmarkssolutions.aws.cli.vpc.model.response.{DnsEntry, Tag}

case class VpcEndpoint(VpcEndpointId:String,
                       VpcEndpointType:String,
                       VpcId:String,
                       ServiceName:String,
                       State:String,
                       PolicyDocument:String,
                       RouteTableIds:List[String],
                       SubnetIds:List[String],
                       Groups:List[Group],
                       PrivateDnsEnabled:Boolean,
                       RequesterManaged:Boolean,
                       NetworkInterfaceIds:List[String],
                       DnsEntries:List[DnsEntry],
                       CreationTimestamp:String,
                       Tags:List[Tag],
                       OwnerId:Option[String],
                       LastError:Option[LastError]
                      )
