package com.stmarkssolutions.aws.cli.vpc.util

import com.stmarkssolutions.aws.cli.vpc.model.request.Filter
import org.junit.{After, Before, Test}
import org.junit.Assert._
import com.stmarkssolutions.aws.cli.vpc.util.StringUtil._

class TestStringUtil {

  @Test
  def testMakeFilterListString(): Unit ={

    val filterList = List(Filter("tag:Project",List("Infrastructure")),
        Filter("owner-id",List("123456789"))
    )
    val filterStr = makeFilterListString(filterList)
    println(filterStr)
  }

  @Test
  def testFilterToStringOneValue(): Unit ={

    val expected = "Name=tag:Project,Values=Infrastructure"
    val filter = Filter("tag:Project",List("Infrastructure"))
    val filterStr= filterToString(filter)
    assertNotNull(filterStr)
    println(filterStr)
    assertEquals(expected,filterStr)
  }

  @Test
  def testFilterToStringTwoValues(): Unit ={

    val expected = "Name=tag:aws:cloudformation:stack-name,Values=EntSvcs-DEV,dev-backend-subnets"
    val filter = Filter("tag:aws:cloudformation:stack-name",List("EntSvcs-DEV","dev-backend-subnets"))
    val filterStr= filterToString(filter)
    assertNotNull(filterStr)
    println(filterStr)
    assertEquals(expected,filterStr)
  }


  @Test
  def testFilterToStringAllNull(): Unit ={

    val expected = ""
    val filter = Filter(null,null)
    val filterStr= filterToString(filter)
    assertNotNull(filterStr)
    println(filterStr)
    assertEquals(expected,filterStr)
  }

  @Test
  def testFilterToStringNameNull(): Unit ={

    val expected = ""
    val filter = Filter(null,List("DEV"))
    val filterStr= filterToString(filter)
    assertNotNull(filterStr)
    println(filterStr)
    assertEquals(expected,filterStr)
  }

  @Test
  def testFilterToStringNaluesNull(): Unit ={

    val expected = ""
    val filter = Filter("tag:aws:cloudformation:stack-name",null)
    val filterStr= filterToString(filter)
    assertNotNull(filterStr)
    println(filterStr)
    assertEquals(expected,filterStr)
  }

  @Test
  def testFilterToStringEmptyList(): Unit ={

    val expected = ""
    val filter = Filter("tag:aws:cloudformation:stack-name",List())
    val filterStr= filterToString(filter)
    assertNotNull(filterStr)
    println(filterStr)
    assertEquals(expected,filterStr)
  }
}
