package com.stmarkssolutions.aws.cli.vpc.model.describe.customergateways

import com.stmarkssolutions.aws.cli.vpc.model.request.{DescribeRequestParams, Filter}
import com.stmarkssolutions.aws.cli.vpc.util.StringUtil.makeFilterListString

case class DescribeCustomerGatewaysRequestParams(override val Filters:Option[List[Filter]]=None,
                                                 CustomerGatewayIds:Option[List[String]]=None) extends DescribeRequestParams {
  override def stringParams(): String = {

    val filters = Filters.getOrElse(List[Filter]())
    makeFilterListString(filters)
  }
}
