package com.stmarkssolutions.aws.cli.vpc.model.describe.availabilityzones

import com.stmarkssolutions.aws.cli.vpc.model.request.{Filter, DescribeRequestParams}
import com.stmarkssolutions.aws.cli.vpc.util.StringUtil.makeFilterListString

case class DescribeAvailabilityZonesRequestParams(override val Filters:Option[List[Filter]]=None,
                                                  ZoneNames:Option[List[String]]=None,
                                                  ZoneIds:Option[List[String]]=None
                                                 )extends DescribeRequestParams {
  override def stringParams: String = {


    val filters = Filters.getOrElse(List[Filter]())
    makeFilterListString(filters)
  }
}

