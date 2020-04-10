package com.stmarkssolutions.aws.cli.vpc.model.describe.vpcendpointconnections

import com.stmarkssolutions.aws.cli.vpc.model.request.{DescribeRequestParams, Filter}
import com.stmarkssolutions.aws.cli.vpc.util.StringUtil.makeFilterListString

case class DescribeVpcEndpointConnectionsRequestParams(override val Filters:Option[List[Filter]]=None,
                                                       MaxResults:Option[Int]=None,
                                                       NextToken:Option[String])  extends DescribeRequestParams{
  override def stringParams: String = {


    val filters = Filters.getOrElse(List[Filter]())
    makeFilterListString(filters)
  }
}
