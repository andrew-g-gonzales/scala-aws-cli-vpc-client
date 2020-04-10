package com.stmarkssolutions.aws.cli.vpc.model.describe.routetables

import com.stmarkssolutions.aws.cli.vpc.model.response.Tag

case class RouteTable(Associations:Option[List[Association]],
                      PropagatingVgws:List[PropagatingVgw],
                      RouteTableId:String,
                      Routes:List[Route],
                      Tags:List[Tag],
                      VpcId:String,
                      OwnerId:String
                     )
