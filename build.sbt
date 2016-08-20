



enablePlugins(JavaServerAppPackaging)
enablePlugins(SystemVPlugin)
startRunlevels  :=Option("3")
maintainer := "Sanket Sharma"
packageSummary := "Native packager test project"
packageDescription := "Native packager test project"
stopRunlevels :=Option("3")
rpmVendor:="Sanket Sharma"
rpmRelease:="1"
version:="0.0.1"
serverLoading:= Option(ServerLoader.SystemV)
rpmLicense := Some("BSD")
