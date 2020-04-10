package com.stmarkssolutions.aws.cli.vpc.model.describe.internetgateways

import com.stmarkssolutions.aws.cli.vpc.model.request.{DescribeRequestParams, Filter}
import com.stmarkssolutions.aws.cli.vpc.util.StringUtil.makeFilterListString

case class DescribeInternetGatewaysRequestParams(override val Filters:Option[List[Filter]]=None,
                                                 InternetGatewayIds:Option[List[String]]=None,
                                                 NextToken:Option[String],
                                                 MaxResults:Option[Int]) extends DescribeRequestParams {
  override def stringParams(): String = {


    val filters = Filters.getOrElse(List[Filter]())
    makeFilterListString(filters)
  }
}
