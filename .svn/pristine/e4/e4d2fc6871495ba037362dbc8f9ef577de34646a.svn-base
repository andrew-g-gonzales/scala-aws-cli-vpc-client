package com.stmarkssolutions.aws.cli.vpc.model.describe.nacls

import com.stmarkssolutions.aws.cli.vpc.model.response.Tag

case class NetworkAcl(Associations:List[Association],
                      Entries:List[Entry],
                      IsDefault:Boolean,
                      NetworkAclId:String,
                      Tags:List[Tag],
                      VpcId:String,
                      OwnerId:String
                     )

case class Association(NetworkAclAssociationId:String,
                       NetworkAclId:String,
                       SubnetId:String)


case class Entry(CidrBlock:String,
                 Egress:Boolean,
                 IcmpTypeCode:Option[IcmpTypeCode],
                 Ipv6CidrBlock:Option[String],
                 PortRange:Option[PortRange],
                 Protocol:String,
                 RuleAction:String,
                 RuleNumber:String
                )

case class IcmpTypeCode(Code :Int,
                        Type :Int)

case class PortRange(From :Int,
                     To:Int)