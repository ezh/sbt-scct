package com.github.scct

package object sbt {
  /** Entry point for plugin in user's project */
  def ScctPlugin = Plugin.defaultSettings
  def ScctMergeReportSettings = Plugin.mergeReportSettings

  // export declarations for end user
  lazy val ScctKey = Keys
  lazy val ScctConf = Keys.Scct
  lazy val ScctTestConf = Keys.Scct

  // public keys
}
