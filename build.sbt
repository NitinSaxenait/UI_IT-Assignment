name := "UT_IT_Updated_Assignment"

version := "0.1"

scalaVersion := "2.13.4"

lazy val UT_IT_Q1_Q2 = project.in(file("UT_IT_Q1_Q2"))
  .settings(
    libraryDependencies ++= Seq( "org.scalatest" %% "scalatest" % "3.2.3" % Test,
      "org.mockito" %% "mockito-scala" % "1.5.12" % Test
    )
  )


lazy val UT_IT_Q3= project.in(file("UT_IT_Q3"))
  .settings(
    libraryDependencies ++= Seq( "org.scalatest" %% "scalatest" % "3.2.3" % Test,
      "org.mockito" %% "mockito-scala" % "1.5.12" % Test
    )
  )
lazy val UT_IT_Updated_Assignment = (project in file(".")).aggregate(UT_IT_Q1_Q2,UT_IT_Q3)