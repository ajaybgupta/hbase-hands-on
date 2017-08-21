name := "hbase-java-api"

version := "1.0"

scalaVersion := "2.10.5"

val exclusionRule = List(
  ExclusionRule(organization = "javax.servlet", name = "javax.servlet-api"),
  ExclusionRule(organization = "org.mortbay.jetty", name = "jetty"),
  ExclusionRule(organization = "org.mortbay.jetty", name = "servlet-api-2.5")
)
libraryDependencies += "org.apache.hbase" % "hbase-client" % "1.1.2" excludeAll (exclusionRule: _*)
libraryDependencies += "org.apache.hbase" % "hbase-server" % "1.1.2" excludeAll (exclusionRule: _*)
libraryDependencies += "org.apache.hbase" % "hbase-common" % "1.1.2" excludeAll (exclusionRule: _*)

//*** Scala Unit Test Library
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0"
parallelExecution in Test := false