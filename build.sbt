ThisBuild / scalaVersion := "3.3.5"
ThisBuild / organization := "com.invisirisk.qa"
ThisBuild / version := "0.1.0"

lazy val root = (project in file("."))
  .settings(
    name := "scala-native-ir-baf",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "2.12.0",
      "io.circe" %% "circe-parser" % "0.14.10",
      "org.scalameta" %% "munit" % "1.0.3" % Test
    ),
    testFrameworks += new TestFramework("munit.Framework")
  )
