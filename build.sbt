scalaVersion := "2.11.7"

javacOptions ++= Seq("-encoding", "UTF-8")

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "1.6.0"
  , "org.apache.spark" %% "spark-sql" % "1.6.0"
  , "com.databricks" % "spark-csv_2.11" % "1.3.0"
  , "org.scala-lang" % "scala-reflect" % "2.11.7"
  )

mainClass in (Compile, run) := Some("Example")
