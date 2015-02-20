import AssemblyKeys._

assemblySettings

excludedJars in assembly <<= (fullClasspath in assembly)

name := "516-worflow"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.apache.spark"  %% "spark-core"       % "1.2.1",
  "org.apache.spark"  %% "spark-catalyst"   % "1.2.1",
  "org.apache.spark"  %% "spark-hive"       % "1.2.1",
  "org.apache.spark"  %% "spark-sql"        % "1.2.1"
)

libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.6.0"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

