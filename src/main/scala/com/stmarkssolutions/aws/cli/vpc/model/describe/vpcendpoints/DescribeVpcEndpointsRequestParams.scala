package com.stmarkssolutions.aws.cli.vpc.model.describe.vpcendpoints

import com.stmarkssolutions.aws.cli.vpc.model.request.{DescribeRequestParams, Filter}
import com.stmarkssolutions.aws.cli.vpc.util.StringUtil.makeFilterListString

case class DescribeVpcEndpointsRequestParams(override val Filters:Option[List[Filter]]=None,
                                             VpcEndpointIds:Option[List[String]]=None,
                                             MaxResults:Option[Int]=None,
                                             NextToken:Option[String]
                                            )  extends DescribeRequestParams{
  override def stringParams: String = {


    val filters = Filters.getOrElse(List[Filter]())
    makeFilterListString(filters)
  }
}
