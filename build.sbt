name := "PrimeirosPassos-Scala"

version := "1.0"

scalaVersion := "2.12.1"

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.19")
enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"
scalaVersion := "2.12.2" // or any other Scala version >= 2.10.2

// This is an application with a main method
scalaJSUseMainModuleInitializer := true