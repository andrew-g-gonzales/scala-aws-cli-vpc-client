package com.stmarkssolutions.aws.cli.vpc.model.describe.networkinterfaces

case class Association(AllocationId:Option[String],
                       AssociationId:Option[String],
                       IpOwnerId:String,
                       PublicDnsName:String,
                       PublicIp:String
                      )
