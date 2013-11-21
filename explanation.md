# Sources

Why there are 3 source files? Separation.

* [Keys.scala][ks]

Everyone may easily overview plugin configuration and keys. Someday you will add two new keys, then one more, then ... [here][osgi] or [here][an]
It is separated from logic.

* [Plugins][pl]

IMHO this file must be as small as possible and contains all **core** functions.

* [package object][po]

It contain only public part of plugin that is imported to user name space.

example for build.sbt

    import com.github.scct.sbt._

    ScctPlugin ++ ScctMergeReportSettings

# Configuration

* SBT cross build is too logy. Internal source generators provide embedded ability to organize agile [patch][pa] system that support SBT 0.11 and more (If needed)

* Publishing configuration is unneccesary for every contributor who will fork plugin for improvements. Everyone will wipe it.

Write script that do cross publish once and use it always.

IMHO every plugin *must* contain minimum information for personal development and *must* be builded directly from GitHub for every common SBT version as source code dependency. 

*Also this code need headers*

[ks]: https://github.com/ezh/sbt-scct/blob/alt-layout/src/main/scala/com/github/scct/sbt/Keys.scala
[pl]: https://github.com/ezh/sbt-scct/blob/alt-layout/src/main/scala/com/github/scct/sbt/Plugin.scala
[po]: https://github.com/ezh/sbt-scct/blob/alt-layout/src/main/scala/com/github/scct/sbt/package.scala
[osgi]: https://github.com/digimead/sbt-osgi-manager/blob/master/src/main/scala/sbt/osgi/manager/Keys.scala
[an]: https://github.com/sbt-android-mill/sbt-android-mill/blob/master/src/main/scala/sbt/android/mill/MillKeys.scala
[pa]: https://github.com/digimead/sbt-site-manager/tree/master/src/patch