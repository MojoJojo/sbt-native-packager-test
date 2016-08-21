

disablePlugins(CloudFormation)
 val main = Project("sbt-native-packager-test",base = file("."))

.enablePlugins(JavaServerAppPackaging)
.enablePlugins(SystemVPlugin)
.settings(rpmGroup:=Some("Applications/CTILogic"))
.settings(startRunlevels  :=Option("3"))
.settings(maintainer := "Sanket Sharma")
.settings(packageSummary := "Native packager test project")
.settings(packageDescription := "Native packager test project")
.settings(stopRunlevels :=Option("3"))
.settings(rpmVendor:="Sanket Sharma")
.settings(rpmRelease:="1")
.settings(version:="0.0.1")
.settings(serverLoading:= Option(ServerLoader.SystemV))
.settings(rpmLicense := Some("BSD"))

