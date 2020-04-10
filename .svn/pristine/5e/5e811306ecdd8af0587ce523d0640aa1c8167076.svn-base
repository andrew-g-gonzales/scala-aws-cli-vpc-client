package com.stmarkssolutions.aws.cli.vpc.model.describe.vpngateways

import com.stmarkssolutions.aws.cli.vpc.model.request.{DescribeRequestParams, Filter}
import com.stmarkssolutions.aws.cli.vpc.util.StringUtil.makeFilterListString

case class DescribeVpnGatewaysRequestParams(override val Filters:Option[List[Filter]]=None,
                                            VpnGatewayIds:Option[List[String]]=None) extends DescribeRequestParams{
  override def stringParams: String = {

    val filters = Filters.getOrElse(List[Filter]())
    makeFilterListString(filters)
  }
}
