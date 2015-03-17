import AssemblyKeys._

assemblySettings

excludedJars in assembly <<= (fullClasspath in assembly)

name := "516-worflow"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.apache.spark"  %% "spark-core"       % "1.3.0",
  "org.apache.spark"  %% "spark-catalyst"   % "1.3.0",
  "org.apache.spark"  %% "spark-hive"       % "1.3.0",
  "org.apache.spark"  %% "spark-sql"        % "1.3.0"
)

libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.2.0"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

