import sbt._
import Keys._

object AkkaTemplate extends Build {

  val AKKA_VERSION = "2.3.9"
  val SCALATEST_VERSION = "2.2.0"

  val GeneralSettings = Seq[Setting[_]](

    scalaVersion := "2.11.8",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor"   % AKKA_VERSION,
      "com.typesafe.akka" %% "akka-testkit" % AKKA_VERSION,
      "org.scalatest"     %% "scalatest"    % SCALATEST_VERSION % "test"
    )
  )

  lazy val RootProject = Project(id = "root", base = file("."))
    .settings(GeneralSettings:_*)

}
