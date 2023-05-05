import sbt._

object Dependencies {

  private object Versions {
    val zio         = "1.0.11"    
    val doobie      = "1.0.0-RC2"    
    val postgres    = "42.3.5"
    val hikari      = "4.0.3"
    val zioLogging  = "0.5.10"
    val circe       = "0.14.1"
    val circeEnum   = "1.7.0"    
  }

  object Libraries {

    val zio = Seq(
      "dev.zio" %% "zio"          % Versions.zio,
      "dev.zio" %% "zio-streams"  % Versions.zio,
      "dev.zio" %% "zio-macros"   % Versions.zio,
      "dev.zio" %% "zio-test"     % Versions.zio % Test,
      "dev.zio" %% "zio-test-sbt" % Versions.zio % Test
    )
   
    val doobie = Seq(
      "org.tpolecat" %% "doobie-core" % Versions.doobie,
      "org.tpolecat" %% "doobie-hikari" % Versions.doobie,
      "org.tpolecat" %% "doobie-postgres" %  Versions.doobie
    )
   
    val zioLogging = Seq(
      "dev.zio" %% "zio-logging"       % Versions.zioLogging,
      "dev.zio" %% "zio-logging-slf4j" % Versions.zioLogging
    )

    val circe = Seq(
      "io.circe" %% "circe-core"    % Versions.circe,
      "io.circe" %% "circe-parser"  % Versions.circe,
      "io.circe" %% "circe-generic" % Versions.circe,
      "com.beachape" %% "enumeratum-circe" % Versions.circeEnum
    )
  }
}