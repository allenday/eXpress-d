resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

resolvers += Resolver.url("artifactory", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

resolvers += "Bintray sbt plugin releases" at "http://dl.bintray.com/sbt/sbt-plugin-releases/"

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.0")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.0")
