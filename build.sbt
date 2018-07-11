name := """torus-api"""

lazy val commonSettings = Seq(
  organization := "fscoward",
  version := "1.0-SNAPSHOT",
  scalaVersion := "2.12.6"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)

lazy val torusApp = (project in file("torus-app")).enablePlugins(PlayScala)
  .settings(commonSettings, dependencies)
  .dependsOn(torusDomain)

lazy val torusDomain = (project in file("torus-domain"))
  .settings(commonSettings)


//libraryDependencies += guice
//libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test

val dependencies = libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "fscoward.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "fscoward.binders._"
