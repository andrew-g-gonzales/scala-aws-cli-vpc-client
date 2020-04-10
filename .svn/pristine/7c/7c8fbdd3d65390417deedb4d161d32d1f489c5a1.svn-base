package com.stmarkssolutions.aws.cli.vpc.model.describe.subnets

import com.stmarkssolutions.aws.cli.vpc.model.response.Tag

case class Subnet(AvailabilityZone:String,
                  AvailabilityZoneId:String,
                  AvailableIpAddressCount:Int,
                  CidrBlock:String,
                  DefaultForAz:Boolean,
                  MapPublicIpOnLaunch:Boolean,
                  State:String,
                  SubnetId:String,
                  VpcId:String,
                  OwnerId:String,
                  AssignIpv6AddressOnCreation:Boolean,
                  Ipv6CidrBlockAssociationSet:List[Ipv6CidrBlockAssociation],
                  Tags:List[Tag],
                  SubnetArn:String,
                  OutpostArn:Option[String]
                 )

case class Ipv6CidrBlockAssociation(AssociationId:String,
                                       Ipv6CidrBlock:String,
                                    Ipv6CidrBlockState:Ipv6CidrBlockState
                                      )

case class Ipv6CidrBlockState(State:String,
                              StatusMessage:String)
