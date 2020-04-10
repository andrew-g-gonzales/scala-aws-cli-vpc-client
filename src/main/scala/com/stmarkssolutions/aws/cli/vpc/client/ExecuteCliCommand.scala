package com.stmarkssolutions.aws.cli.vpc.client

import com.stmarkssolutions.aws.cli.vpc.model.request.{Filter, DescribeRequestParams}
import com.stmarkssolutions.aws.cli.vpc.client.AwsCliCommands._
import com.stmarkssolutions.aws.cli.vpc.client.AwsCliS3ApiClient.invokeCLICommand
import com.stmarkssolutions.aws.cli.vpc.client.json.DeserializeJSON
import com.stmarkssolutions.aws.cli.vpc.model.describe.vpcs._
import com.stmarkssolutions.aws.cli.vpc.model.describe.routetables._
import com.stmarkssolutions.aws.cli.vpc.model.describe.securitygroups._
import com.stmarkssolutions.aws.cli.vpc.model.describe.subnets._
import com.stmarkssolutions.aws.cli.vpc.util.StringUtil.{makeFilterListString, _}
import com.stmarkssolutions.aws.cli.vpc.client.json.DeserializeJSON.deserialize
import com.stmarkssolutions.aws.cli.vpc.model.describe.availabilityzones.{DescribeAvailabilityZonesRequestParams, DescribeAvailabilityZonesResponse}
import com.stmarkssolutions.aws.cli.vpc.model.describe.nacls.{DescribeNetworkAclsRequestParams, DescribeNetworkAclsResponse}

object ExecuteCliCommand {

  def execute_cli_command[T <: DescribeRequestParams,S](command:String)(parameters:Option[T]=None)(implicit m: Manifest[S]):Either[String,S]={

    val strArgs = parameters match {
      case Some(params)=>{
        params.stringParams
      }
      case None=>{
        ""
      }
    }

    process_results[S](invokeCLICommand(s"$command $strArgs"))
  }

  private def process_results[T](result:(Option[String],Option[String],Int))(implicit m: Manifest[T]): Either[String,T] ={
    val success = result._3 == 0
    success match {
      case true =>{
        val response  = result._1 match {
          case Some(jsonStr)=>{
            val vpcResult = deserialize[T](jsonStr)

            Right(vpcResult)
          }
          case None=>{
            Left(s"An error occurred while attempting to execute CLI command")
          }
        }
        response
      }
      case false =>{
        val errorStr = result._2
        Left(errorStr.getOrElse(s"An error occurred while attempting to execute CLI command"))
      }
    }
  }


}
