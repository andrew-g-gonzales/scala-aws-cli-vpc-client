package com.stmarkssolutions.aws.cli.vpc.model.describe.customergateways

import com.stmarkssolutions.aws.cli.vpc.model.response.Tag

case class CustomerGateway(BgpAsn:String,
                           CustomerGatewayId:String,
                           IpAddress:String,
                           CertificateArn:Option[String],
                           State :String,
                           Type:String,
                           DeviceName:String,
                           Tags:List[Tag]
                          )
