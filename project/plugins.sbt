resolvers += Resolver.url("myyk-bintray-sbt-plugins", url("https://dl.bintray.com/myyk/sbt-plugins/"))(Resolver.ivyStylePatterns)
addSbtPlugin("com.github.tptodorov" % "sbt-cloudformation" % "0.7.1")
addSbtPlugin("com.github.myyk" % "sbt-codedeploy" % "0.6.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.2.0-M5")