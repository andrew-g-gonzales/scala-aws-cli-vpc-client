package com.stmarkssolutions.aws.cli.vpc.model.describe.vpcs

case class CidrBlockAssociation(AssociationId:String,
                                CidrBlock:String,
                                CidrBlockState:CidrBlockState)
