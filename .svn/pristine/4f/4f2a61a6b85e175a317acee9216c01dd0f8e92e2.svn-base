package com.stmarkssolutions.aws.cli.vpc.model.describe.subnets

import com.stmarkssolutions.aws.cli.vpc.model.request.{Filter, DescribeRequestParams}
import com.stmarkssolutions.aws.cli.vpc.util.StringUtil.makeFilterListString

case class DescribeSubnetsRequestParams(override val Filters:Option[List[Filter]]=None,
                                        SubnetIds:Option[List[String]]=None) extends DescribeRequestParams{
  override def stringParams: String = {


    val filters = Filters.getOrElse(List[Filter]())
    makeFilterListString(filters)
  }
}
