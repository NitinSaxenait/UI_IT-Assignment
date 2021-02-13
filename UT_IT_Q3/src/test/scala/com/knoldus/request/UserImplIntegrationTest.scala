package com.knoldus.request

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.User
import com.knoldus.validator.{EmailValidator, UserValidator}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplIntegrationTest extends AnyFlatSpec {

  val companyReadDto = new CompanyReadDto
  val emailValidator = new EmailValidator
  val userValidator = new UserValidator(companyReadDto, emailValidator)
  val userImpl = new UserImpl(userValidator)

  "User" should "be valid" in {

    val nitinUser: User = User("Nitin","Saxena","Knoldus","nitin.saxena@knoldus.com")
    val result =  userImpl.createUser(nitinUser)
    assert(result.isDefined)
  }

  "User" should "be invalid as it company does not exists in DB" in {

    val ramUser: User = User("Ram","Sharma","Google","karan@knoldus.com")
    val result =  userImpl.createUser(ramUser)
    assert(result.isEmpty)
  }

  "Employee" should "be invalid as email id is invalid" in {

    val nitinEmployee: User = User("Nitin","Saxena","Knoldus","nitin.saxena@knoldus.com")
    val result = userImpl.createUser(nitinEmployee)
    assert(!result.isEmpty)
  }

  "Employee" should "be invalid as email id is invalid and company does not exists in DB" in {

    val nitinUser: User = User("Nitin","Saxena","Google","nitin.saxena.com")
    val result =  userImpl.createUser(nitinUser)
    assert(result.isEmpty)
  }
}
