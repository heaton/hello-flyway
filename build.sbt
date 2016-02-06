name := "hello-flyway"

version := "1.0.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.h2database" % "h2" % "1.3.174",
  "org.flywaydb" % "flyway-sbt" % "3.2.1"
)

seq(flywaySettings: _*)

flywayUrl := "jdbc:h2:file:target/foobar"

flywayUser := "SA"

flywayCallbacks := Seq("me.heaton.MyCallback")
