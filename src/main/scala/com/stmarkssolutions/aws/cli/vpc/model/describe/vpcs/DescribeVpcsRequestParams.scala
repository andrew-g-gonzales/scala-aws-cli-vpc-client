package com.stmarkssolutions.aws.cli.vpc.model.describe.vpcs

import com.stmarkssolutions.aws.cli.vpc.model.request.{Filter, DescribeRequestParams}
import com.stmarkssolutions.aws.cli.vpc.util.StringUtil.makeFilterListString

case class DescribeVpcsRequestParams(override val Filters:Option[List[Filter]]=None,
                                     VpcIds:Option[List[String]]=None,
                                     NextToken:Option[String]=None,
                                     MaxResults:Option[Int]=None
                              ) extends DescribeRequestParams{
  override def stringParams: String = {


    val filters = Filters.getOrElse(List[Filter]())
    makeFilterListString(filters)
  }
}
