package com.knoldus.db

import com.knoldus.models.User
import scala.collection.immutable.HashMap

class UserReadDto {

  val nitinUser: User = User("Nitin","Saxena","knoldus","nitin.saxena@knoldus.com")
  val ramUser: User = User("Ram","Sharma","knoldus","ram.sharma@knoldus.com")
  val users: HashMap[String, User] = HashMap("Nitin" -> nitinUser, "Ram" -> ramUser)

  def getUserByName(name: String): Option[User] = users.get(name)
}
