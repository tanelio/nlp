name := "nlp"

version := "1.0"

scalaVersion := "2.12.2"

// https://mvnrepository.com/artifact/com.h2database/h2
// libraryDependencies += "com.h2database" % "h2" % "1.4.195"
//"com.typesafe.slick" %% "slick" % "3.2.0"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.2.0" withSources() withJavadoc(),
  "org.slf4j" % "slf4j-nop" % "1.6.4" withSources() withJavadoc(),
  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.0" withSources() withJavadoc()
)