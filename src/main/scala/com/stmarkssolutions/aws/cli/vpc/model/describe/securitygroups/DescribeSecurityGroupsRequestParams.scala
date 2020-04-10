package com.stmarkssolutions.aws.cli.vpc.model.describe.securitygroups

import com.stmarkssolutions.aws.cli.vpc.model.request.{Filter, DescribeRequestParams}
import com.stmarkssolutions.aws.cli.vpc.util.StringUtil.makeFilterListString

case class DescribeSecurityGroupsRequestParams(override val Filters:Option[List[Filter]]=None,
                                               GroupIds:Option[List[String]]=None,
                                               GroupNames:Option[List[String]]=None,
                                               NextToken:Option[String]=None,
                                               MaxResults:Option[Int]
                                              ) extends DescribeRequestParams {
  override def stringParams: String = {


    val filters = Filters.getOrElse(List[Filter]())
    makeFilterListString(filters)
  }
}
