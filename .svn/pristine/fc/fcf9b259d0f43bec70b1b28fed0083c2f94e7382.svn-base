package com.stmarkssolutions.aws.cli.vpc.model.describe.dhcpoptions

import com.stmarkssolutions.aws.cli.vpc.model.request.{Filter, DescribeRequestParams}
import com.stmarkssolutions.aws.cli.vpc.util.StringUtil.makeFilterListString

case class DescribeDhcpOptionsRequestParams(override val Filters:Option[List[Filter]]=None,
                                            DhcpOptionsIds:Option[List[String]]=None) extends DescribeRequestParams {
  override def stringParams(): String = {


    val filters = Filters.getOrElse(List[Filter]())
    makeFilterListString(filters)
  }
}
