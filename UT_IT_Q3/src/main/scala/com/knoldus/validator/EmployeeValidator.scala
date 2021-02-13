package com.knoldus.validator

import com.knoldus.db.UserReadDto
import com.knoldus.models.{Employee, User}

class EmployeeValidator {


  def employeeIsValid(employee: Employee): Boolean = {
    val obj = new UserReadDto
    val x:Option[User] =obj.getUserByName(employee.emailId)
    if(x.isEmpty)
      true
    else
      false
  }
}