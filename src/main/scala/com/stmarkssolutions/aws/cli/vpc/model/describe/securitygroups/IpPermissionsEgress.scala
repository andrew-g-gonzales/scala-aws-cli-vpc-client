package com.stmarkssolutions.aws.cli.vpc.model.describe.securitygroups

case class IpPermissionsEgress(FromPort :Option[Int],
                               IpProtocol:String,
                               IpRanges:List[IpRange],
                               Ipv6Ranges:List[Ipv6Range],
                               PrefixListIds:List[PrefixListId],
                               ToPort:Option[Int],
                               UserIdGroupPairs:List[UserIdGroupPair]
                              )
