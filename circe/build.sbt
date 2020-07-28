name := "scalatest-circe"

version := "0.0.6-SNAPSHOT"

scalaVersion := "2.12.10"

crossScalaVersions := Seq("2.12.12", "2.13.3")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.1.2",
  "org.gnieh" %% "diffson-circe" % "4.0.2"
)

val circeVersion = "0.13.0"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)
