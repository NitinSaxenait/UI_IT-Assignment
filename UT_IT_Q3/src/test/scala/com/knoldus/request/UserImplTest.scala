package com.knoldus.request

import com.knoldus.models.{Company, User}
import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.validator.UserValidator
import org.mockito.MockitoSugar.{mock, when}

class UserImplTest extends AnyFlatSpec {

  val mockedUserValidate: UserValidator = mock[UserValidator]
  val ramUser: User = User("Ram","Sharma","knoldus","ram.sharma@knoldus.com")
  val nitinUser: User = User("Nitin","Saxena","knoldus","nitin.saxena@knoldus.com")
  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")

  "User" should "be valid" in {

    val userImpl = new UserImpl(mockedUserValidate)
    when(mockedUserValidate.userIsValid(nitinUser)) thenReturn true
    val result = userImpl.createUser(nitinUser)
    assert(result.isDefined)
  }

  "User" should "be not valid" in {

    val userImpl = new UserImpl(mockedUserValidate)
    when(mockedUserValidate.userIsValid(ramUser)) thenReturn false
    val result = userImpl.createUser(ramUser)
    assert(result.isEmpty)
  }
}
