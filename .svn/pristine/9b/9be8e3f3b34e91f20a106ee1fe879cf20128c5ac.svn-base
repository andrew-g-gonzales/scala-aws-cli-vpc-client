package com.stmarkssolutions.aws.cli.vpc.model.request

import com.stmarkssolutions.aws.cli.vpc.util.StringUtil.makeFilterListString

trait DescribeRequestParams {
   def Filters:Option[List[Filter]]=None
   def stringParams(): String = {


      val filters = Filters.getOrElse(List[Filter]())
      makeFilterListString(filters)
   }
}
