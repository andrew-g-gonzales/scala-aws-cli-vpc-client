package com.stmarkssolutions.aws.cli.vpc.model.describe.networkinterfaces

import com.stmarkssolutions.aws.cli.vpc.model.request.{Filter, DescribeRequestParams}
import com.stmarkssolutions.aws.cli.vpc.util.StringUtil.makeFilterListString

case class DescribeNetworkInterfacesRequestParams(override val Filters:Option[List[Filter]]=None,
                                                  NetworkInterfaceIds:Option[List[String]],
                                                  NextToken:Option[String],
                                                  MaxResults:Option[Int]
                                                 )extends DescribeRequestParams {
  override def stringParams: String = {


    val filters = Filters.getOrElse(List[Filter]())
    makeFilterListString(filters)
  }
}
