package com.github.scct.sbt

import sbt._

object Keys {
  def Scct = config("scct")
  def ScctTest = config("scctTest") extend Scct

  lazy val scctReportDir = SettingKey[File]("scctReportDir")
  lazy val scctExcludePackages = SettingKey[String]("scctExcludePackage")
  lazy val scctMergeReportSourceFiles = TaskKey[Seq[File]]("scctMergeReportSourceFiles")
  lazy val scctMergeReport = TaskKey[File]("scctMergeReport")
}
