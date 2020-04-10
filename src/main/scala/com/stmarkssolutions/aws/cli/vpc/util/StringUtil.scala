package com.stmarkssolutions.aws.cli.vpc.util

import com.stmarkssolutions.aws.cli.vpc.model.request.Filter

object StringUtil {

  def makeFilterListString(filterList:List[Filter])=  raw""" --filter "${filterList.map(filterToString).mkString(" ")}""""

  def stringIsBlank(strOpt: Option[String]): Boolean =strOpt.forall(_.trim.isEmpty)

  def filterToString(filter:Filter):String = {

    val filterTxt = Option(filter) match {
      case Some(filterObj)=>{

       val filterStr =  stringIsBlank(Option(filterObj.Name)) match {
          case false=>{
            Option(filterObj.Values) match {
              case Some(values)=>{
                values.nonEmpty match {
                  case true=>{
                    s"Name=${filterObj.Name},Values=${filterObj.Values.mkString(",")}"
                  }
                  case false =>{
                    ""
                  }
                }
              }
              case None =>{
                ""
              }
            }
          }
          case true=>{
            ""
          }
        }

        filterStr
      }
      case None=>{
        ""
      }
    }

    filterTxt
  }
}
