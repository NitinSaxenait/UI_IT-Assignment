package com.knoldus.validator

class EmailValidator {

  def emailIdIsValid(emailId: String): Boolean = {

    val regex= """^([_|a-zA-Z\d\.-]+)@([a-zA-Z\d-]+)\.(com|net|org)$"""
    emailId.matches(regex)
  }
}