name := "pyrolite"

organization := "net.razorvine"

version := "2.0"

javaSource in Compile := baseDirectory.value / "java" / "src"

unmanagedBase in Compile := baseDirectory.value / "java"/ "lib"
