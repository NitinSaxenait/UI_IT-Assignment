package com.knoldus

class EmailValid {

  def isValidEmail(emailid: String) :Boolean={

    val regex= """^([_|a-zA-Z\d\.-]+)@([a-zA-Z\d-]+)\.(com|net|org)$"""
    emailid.matches(regex)
  }

  def main(args:Array[String]): Unit ={

    val ch= isValidEmail("try@gmail.com")
    println(ch)
  }
}

