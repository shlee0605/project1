import AssemblyKeys._

assemblySettings

excludedJars in assembly <<= (fullClasspath in assembly)

name := "516-worflow"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.2.1"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.6.0"

libraryDependencies += "org.apache.spark" % "spark-hive_2.10" % "1.2.1"

libraryDependencies += "org.apache.spark" % "spark-yarn_2.10" % "1.2.1"

libraryDependencies += "org.apache.hadoop" % "hadoop-yarn-server-web-proxy" % "2.6.0"
