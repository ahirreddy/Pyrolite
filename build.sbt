name := "pyrolite"

organization := "net.razorvine"

version := "2.0"

javaSource in Compile := baseDirectory.value / "java" / "src"

unmanagedBase in Compile := baseDirectory.value / "java"/ "lib"

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomExtra := (
  <url>http://pythonhosted.org/Pyro4/</url>
  <licenses>
    <license>
      <name>MIT License</name>
      <url>http://www.opensource.org/licenses/mit-license.php</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:irmen/Pyrolite.git</url>
    <connection>scm:git:git@github.com:irmen/Pyrolite.git</connection>
  </scm>
  <developers>
    <developer>
      <id>irmen</id>
      <name>Irmen de Jong</name>
      <url>http://www.razorvine.net/</url>
    </developer>
  </developers>)

credentials += Credentials("Sonatype Nexus Repository Manager",
                           "oss.sonatype.org",
                           "<your username>",
                           "<your password>")
