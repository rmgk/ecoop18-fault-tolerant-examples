lazy val calendar = project.in(file("."))
  .settings(name := "calendar",
    cfg.base, cfg.rescala, cfg.restoration,
    scalaSource in Compile := baseDirectory.value)

// ===================================================================================== Settings

lazy val cfg = new {

  val version_211 = "2.11.12"
  val version_212 = "2.12.6"

  val base = List(
    organization := "de.tuda.stg",
    scalaVersion := version_212,
    crossScalaVersions := Seq(version_211, version_212),
    baseScalac,
    autoAPIMappings := true,
    resolvers += Resolver.bintrayRepo("stg-tud", "maven"),
    Compile / doc / scalacOptions += "-groups",
  )

  lazy val baseScalac = scalacOptions ++= List(
    "-deprecation",
    "-encoding", "UTF-8",
    "-unchecked",
    "-feature",
    "-Xlint",
    "-Xfuture",
//    "-Xdisable-assertions"
  )

  lazy val rescala =
    libraryDependencies += "de.tuda.stg" %% "rescala" % "0.24.0"
  lazy val restoration =
    libraryDependencies += "de.tuda.stg" %% "rescala-restoration" % "0.24.0"
}

