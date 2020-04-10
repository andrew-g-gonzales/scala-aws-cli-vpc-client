package com.stmarkssolutions.aws.cli.vpc.model.describe.networkinterfaces

import com.stmarkssolutions.aws.cli.vpc.model.response.Tag

case class NetworkInterface(Status:String,
                            MacAddress:String,
                            SourceDestCheck:Boolean,
                            Association:Option[Association],
                            Attachment:Option[Attachment],
                            AvailabilityZone:String,
                            Description:Option[String],
                            Groups:Option[List[Group]],
                            InterfaceType:String,
                            Ipv6Addresses:Option[List[Ipv6Address]],
                            NetworkInterfaceId:String,
                            OutpostArn:Option[String],
                            OwnerId:String,
                            PrivateDnsName:Option[String],
                            PrivateIpAddress:String,
                            RequesterId:Option[String],
                            RequesterManaged:Boolean,
                            SubnetId :String,
                            TagSet:List[Tag],
                            VpcId:String
                           )


case class Ipv6Address(Ipv6Address:String)

