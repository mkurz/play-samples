// The Play plugin
//addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.9.0-RC2")
//addSbtPlugin("com.typesafe.play" % "sbt-play-ebean" % "7.0.0-RC2")


addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.20")
addSbtPlugin("com.typesafe.play" % "sbt-play-ebean" % "6.2.0-RC7")


ThisBuild / libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always