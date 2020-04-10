package com.stmarkssolutions.aws.cli.vpc.client

import com.stmarkssolutions.aws.cli.vpc.client.AwsCliCommands._
import org.junit.{After, Before, Test}
import org.junit.Assert._
import com.stmarkssolutions.aws.cli.vpc.client.ExecuteCliCommand._
import com.stmarkssolutions.aws.cli.vpc.model.describe.customergateways.{DescribeCustomerGatewaysRequestParams, DescribeCustomerGatewaysResponse}
import com.stmarkssolutions.aws.cli.vpc.model.describe.dhcpoptions.{DescribeDhcpOptionsRequestParams, DescribeDhcpOptionsResponse}
import com.stmarkssolutions.aws.cli.vpc.model.describe.flowlogs.{DescribeFlowLogsRequestParams, DescribeFlowLogsResponse}
import com.stmarkssolutions.aws.cli.vpc.model.describe.internetgateways.{DescribeInternetGatewaysRequestParams, DescribeInternetGatewaysResponse}
import com.stmarkssolutions.aws.cli.vpc.model.describe.nacls.{DescribeNetworkAclsRequestParams, DescribeNetworkAclsResponse}
import com.stmarkssolutions.aws.cli.vpc.model.describe.networkinterfacepermissions.{DescribeNetworkInterfacePermissionsRequestParams, DescribeNetworkInterfacePermissionsResponse}
import com.stmarkssolutions.aws.cli.vpc.model.describe.networkinterfaces.{DescribeNetworkInterfacesRequestParams, DescribeNetworkInterfacesResponse}
import com.stmarkssolutions.aws.cli.vpc.model.describe.vpcs._
import com.stmarkssolutions.aws.cli.vpc.model.describe.routetables.{DescribeRouteTablesResponse, _}
import com.stmarkssolutions.aws.cli.vpc.model.describe.securitygroups.{DescribeSecurityGroupsRequestParams, DescribeSecurityGroupsResponse}
import com.stmarkssolutions.aws.cli.vpc.model.describe.subnets.{DescribeSubnetsRequestParams, DescribeSubnetsResponse, Subnet}
import com.stmarkssolutions.aws.cli.vpc.model.describe.vpcendpointconnections.{DescribeVpcEndpointConnectionsRequestParams, DescribeVpcEndpointConnectionsResponse}
import com.stmarkssolutions.aws.cli.vpc.model.describe.vpcendpoints.{DescribeVpcEndpointsRequestParams, DescribeVpcEndpointsResponse}
import com.stmarkssolutions.aws.cli.vpc.model.describe.vpnconnections.{DescribeVpnConnectionsRequestParams, DescribeVpnConnectionsResponse}
import com.stmarkssolutions.aws.cli.vpc.model.describe.vpngateways.{DescribeVpnGatewaysRequestParams, DescribeVpnGatewaysResponse}
import com.stmarkssolutions.aws.cli.vpc.model.request.Filter
import com.stmarkssolutions.aws.cli.vpc.util.StringUtil._

class TestExecuteCliCommand {

  @Test
  def test_describe_customer_gateways(): Unit ={

    val eitherResult = execute_cli_command[DescribeCustomerGatewaysRequestParams,DescribeCustomerGatewaysResponse](DescribeCustomerGateways)(None)
    check_either_result[DescribeCustomerGatewaysResponse](eitherResult)
  }

  @Test
  def test_describe_flow_logs(): Unit ={

    val eitherResult = execute_cli_command[DescribeFlowLogsRequestParams,DescribeFlowLogsResponse](DescribeFlowLogs)(None)
    check_either_result[DescribeFlowLogsResponse](eitherResult)
  }

  @Test
  def test_describe_vpn_connections(): Unit ={

    val eitherResult = execute_cli_command[DescribeVpnConnectionsRequestParams,DescribeVpnConnectionsResponse](DescribeVpnConnections)(None)
    check_either_result[DescribeVpnConnectionsResponse](eitherResult)
  }

  @Test
  def test_describe_vpn_gateways(): Unit ={

    val eitherResult = execute_cli_command[DescribeVpnGatewaysRequestParams,DescribeVpnGatewaysResponse](DescribeVpnGateways)(None)
    check_either_result[DescribeVpnGatewaysResponse](eitherResult)
  }

  @Test
  def test_describe_internet_gateways(): Unit ={

    val eitherResult = execute_cli_command[DescribeInternetGatewaysRequestParams,DescribeInternetGatewaysResponse](DescribeInternetGateways)(None)
    check_either_result[DescribeInternetGatewaysResponse](eitherResult)
  }

  @Test
  def test_describe_vpc_endpoint_connections(): Unit ={

    val eitherResult = execute_cli_command[DescribeVpcEndpointConnectionsRequestParams,DescribeVpcEndpointConnectionsResponse](DescribeVpcEndpointConnections)(None)
    check_either_result[DescribeVpcEndpointConnectionsResponse](eitherResult)
  }

  @Test
  def test_describe_vpc_endpoints(): Unit ={

    val eitherResult = execute_cli_command[DescribeVpcEndpointsRequestParams,DescribeVpcEndpointsResponse](DescribeVpcEndpoints)(None)
    check_either_result[DescribeVpcEndpointsResponse](eitherResult)
  }

  @Test
  def test_describe_network_interface_permissions(): Unit ={

    val eitherResult = execute_cli_command[DescribeNetworkInterfacePermissionsRequestParams,DescribeNetworkInterfacePermissionsResponse](DescribeNetworkInterfacePermissions )(None)
    check_either_result[DescribeNetworkInterfacePermissionsResponse](eitherResult)
  }

  @Test
  def test_describe_network_interfaces(): Unit ={

    val eitherResult = execute_cli_command[DescribeNetworkInterfacesRequestParams,DescribeNetworkInterfacesResponse](DescribeNetworkInterfaces )(None)
    check_either_result[DescribeNetworkInterfacesResponse](eitherResult)
  }


  @Test
  def test_describe_dhcp_options(): Unit ={

    val eitherResult = execute_cli_command[DescribeDhcpOptionsRequestParams,DescribeDhcpOptionsResponse](DescribeDhcpOptions)(None)
    check_either_result[DescribeDhcpOptionsResponse](eitherResult)
  }


  @Test
  def test_describe_network_acls_without_parameters(): Unit ={

    val eitherResult = execute_cli_command[DescribeNetworkAclsRequestParams,DescribeNetworkAclsResponse](DescribeNetworkAcls)(None)
    check_either_result[DescribeNetworkAclsResponse](eitherResult)

    val networkAclsResponse = eitherResult match {
      case Right(networkAclsResponseEthr)=>{
        networkAclsResponseEthr
      }
    }
  }

  @Test
  def test_describe_network_acls_with_parameters(): Unit ={

    val filters = Filter(Name="association.network-acl-id",Values = Seq("acl-0300d70b9f66cf478") )
    val requestParams = Option(DescribeNetworkAclsRequestParams(Filters= Some(List(filters))))

    val eitherResult = execute_cli_command[DescribeNetworkAclsRequestParams,DescribeNetworkAclsResponse](DescribeNetworkAcls)(requestParams)
    check_either_result[DescribeNetworkAclsResponse](eitherResult)

    /*val networkAclsResponse = eitherResult match {
      case Right(networkAclsResponseEthr)=>{
        networkAclsResponseEthr
      }
    }*/
  }

  @Test
  def test_describe_security_groups(): Unit ={

    val eitherResult = execute_cli_command[DescribeSecurityGroupsRequestParams,DescribeSecurityGroupsResponse](DescribeSecurityGroups)(None)
    check_either_result[DescribeSecurityGroupsResponse](eitherResult)

    val securityGroupsResponse = eitherResult match {
      case Right(securityGroupsResponseEthr)=>{
        securityGroupsResponseEthr
      }
    }

    val securityGroups = securityGroupsResponse.SecurityGroups

    val groupedByVpcId = securityGroups.groupBy(_.VpcId.getOrElse("None"))

    groupedByVpcId.foreach{
      case(k,v)=>{
        println(k)
        v.foreach(s=>println(s.GroupName))
      }
    }
  }

  @Test
  def test_describe_subnets(): Unit ={
    val eitherResult = execute_cli_command[DescribeSubnetsRequestParams,DescribeSubnetsResponse](DescribeSubnets)(None)
    check_either_result[DescribeSubnetsResponse](eitherResult)

    /*val subnetsResponse = eitherResult match {
      case Right(subnetsResponseEthr)=>{
        subnetsResponseEthr
      }
    }

    val subnets = subnetsResponse.Subnets
    val groupedByVPC = subnets.groupBy(_.VpcId)
    groupedByVPC.foreach{
      case (k,v)=>{
        println(k)
        val subnetsgroupedByAZ = v.groupBy(_.AvailabilityZone)

        subnetsgroupedByAZ.foreach{
          case (k,v)=>{
            println(k)
            val subnets:List[Subnet] = v
            subnets.foreach(s=>println(s.SubnetId))
          }
        }
        println("\n")
      }
    }*/

  }

  @Test
  def test_desribe_route_tables_with_filter_parameters(): Unit ={

    val filters = Filter(Name="owner-id",Values = Seq("820784505615") )
    val requestParams = Option(DescribeRouteTablesRequestParams(Filters= Some(List(filters))))
    val eitherResult = execute_cli_command[DescribeRouteTablesRequestParams,DescribeRouteTablesResponse](DescribeRouteTables)(requestParams)
    check_either_result[DescribeRouteTablesResponse](eitherResult)
  }

  @Test
  def test_desribe_route_tables_without_parameters(): Unit ={

    val eitherResult = execute_cli_command[DescribeRouteTablesRequestParams,DescribeRouteTablesResponse](DescribeRouteTables)(None)
    check_either_result[DescribeRouteTablesResponse](eitherResult)
  }

  def check_either_result[A](eitherResult:Either[String,A]): Unit ={
    assertNotNull(eitherResult)
    println(eitherResult)

    assertTrue(eitherResult.isRight)

    eitherResult match {
      case Right(resp) => {

        assertNotNull(resp)
        println(resp)
      }
      case Left(errorStr) => {
        assertNotNull(errorStr)
        assertFalse(stringIsBlank(Option(errorStr)))
        println(s"errorStr: $errorStr")
        fail()
      }
    }
  }


}
