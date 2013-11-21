organization := "com.github.scct"

name := "sbt-scct"

version := "0.3-SNAPSHOT"

sbtPlugin := true

resolvers += "Sonatype OSS" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies += "com.github.scct" %% "scct" % "0.3-SNAPSHOT"

// There is no "-Xfatal-warnings" because we have cross compilation against different Scala versions
scalacOptions ++= Seq("-encoding", "UTF-8", "-unchecked", "-deprecation", "-Xcheckinit")

// http://vanillajava.blogspot.ru/2012/02/using-java-7-to-target-much-older-jvms.html
javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation", "-source", "1.6", "-target", "1.6")

javacOptions in doc := Seq("-source", "1.6")
