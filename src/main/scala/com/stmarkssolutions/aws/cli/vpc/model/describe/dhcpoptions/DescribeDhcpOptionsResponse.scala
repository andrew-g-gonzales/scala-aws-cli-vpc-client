package com.stmarkssolutions.aws.cli.vpc.model.describe.dhcpoptions

import com.stmarkssolutions.aws.cli.vpc.model.response.Tag

case class DescribeDhcpOptionsResponse(DhcpOptions:List[DhcpOption])

case class DhcpOption(DhcpConfigurations:Option[List[DhcpConfiguration]],
                                       DhcpOptionsId:String,
                                       OwnerId:String,
                                       Tags:List[Tag]
                                      )

case class DhcpConfiguration(Key:String,
                             Values:Option[List[Value]])

case class Value(Value:String)