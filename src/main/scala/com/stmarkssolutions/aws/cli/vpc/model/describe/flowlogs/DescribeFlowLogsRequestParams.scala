package com.stmarkssolutions.aws.cli.vpc.model.describe.flowlogs

import com.stmarkssolutions.aws.cli.vpc.model.request.{DescribeRequestParams, Filter}
import com.stmarkssolutions.aws.cli.vpc.util.StringUtil.makeFilterListString

case class DescribeFlowLogsRequestParams(override val Filters:Option[List[Filter]],
                                         FlowLogIds:Option[List[String]]=None,
                                         MaxResults:Option[Int],
                                         NextToken:Option[String]) extends DescribeRequestParams{
  override def stringParams: String = {

    val filters = Filters.getOrElse(List[Filter]())
    makeFilterListString(filters)
  }
}
