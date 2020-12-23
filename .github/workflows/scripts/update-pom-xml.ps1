$path = "sdk/pom.xml"
[Reflection.Assembly]::LoadWithPartialName("System.Xml.Linq")
$doc = [System.Xml.Linq.XElement]::Load($path)
$ns = $doc.GetDefaultnamespace()

# Modify project information
$versionSplit = $doc.Element($ns + "version").Value -split "-"
$revision = $versionSplit[0]
$changelist = "-" + $versionSplit[1]
$doc.Element($ns + "version").Value = "`${revision}`${changelist}"

# Modify properties
$elProperties = $doc.Element($ns + "properties")
$elProperties.AddFirst([System.Xml.Linq.XElement]::New($ns + "changelist", $changelist))
$elProperties.AddFirst([System.Xml.Linq.XElement]::New($ns + "revision", $revision))

# Modify developers
$elDevelopers = $doc.Element($ns + "developers")
$elDeveloper = $elDevelopers.Element($ns + "developer")
$elDeveloper.Element($ns + "email").Remove()
$elDeveloper.AddFirst([System.Xml.Linq.XElement]::New($ns + "id", "freee K.K."))

# Add <distributionManagement>
$elDistributionManagement = [System.Xml.Linq.XElement]::New(
  $ns + "distributionManagement",
  [System.Xml.Linq.XElement]::New(
    $ns + "snapshotRepository",
    [System.Xml.Linq.XElement]::New($ns + "id", "ossrh"),
    [System.Xml.Linq.XElement]::New($ns + "url", "https://oss.sonatype.org/content/repositories/snapshots")
  ),
  [System.Xml.Linq.XElement]::New(
    $ns + "repository",
    [System.Xml.Linq.XElement]::New($ns + "id", "ossrh"),
    [System.Xml.Linq.XElement]::New($ns + "url", "https://oss.sonatype.org/service/local/staging/deploy/maven2/")
  )
)
$elDevelopers.AddAfterSelf($elDistributionManagement)

# Add maven-deploy-plugin plugin
$elPluginDeployPlugin = [System.Xml.Linq.XElement]::New(
  $ns + "plugin",
  [System.Xml.Linq.XElement]::New($ns + "groupId", "org.apache.maven.plugins"),
  [System.Xml.Linq.XElement]::New($ns + "artifactId", "maven-deploy-plugin"),
  [System.Xml.Linq.XElement]::New($ns + "version", "2.8.2")
)
$doc.Element($ns + "build").Element($ns + "plugins").Add($elPluginDeployPlugin)

# Modify sign-artifacts profile
$elActivation = [System.Xml.Linq.XElement]::New(
  $ns + "activation",
  [System.Xml.Linq.XElement]::New(
    $ns + "property",
    [System.Xml.Linq.XElement]::New($ns + "name", "performRelease"),
    [System.Xml.Linq.XElement]::New($ns + "value", "true")
  )
)
$elConfiguration = [System.Xml.Linq.XElement]::New(
  $ns + "configuration",
  [System.Xml.Linq.XElement]::New(
    $ns + "gpgArguments",
    [System.Xml.Linq.XElement]::New($ns + "arg", "--pinentry-mode"),
    [System.Xml.Linq.XElement]::New($ns + "arg", "loopback")
  )
)
$elProfileSignArtifacts = $doc.Element($ns + "profiles").Elements($ns + "profile").Where({$_.Element($ns + "id").Value -eq "sign-artifacts"})[0]
$elProfileSignArtifactsId = $elProfileSignArtifacts.Element($ns + "id")
$elProfileSignArtifactsId.Value = "release-sign-artifacts"
$elProfileSignArtifactsId.AddAfterSelf($elActivation)
$elPluginSignArtifacts = $elProfileSignArtifacts.Element($ns + "build").Element($ns + "plugins").Elements($ns + "plugin").Where({$_.Element($ns + "artifactId").Value -eq "maven-gpg-plugin"})[0]
$elPluginSignArtifacts.Element($ns + "version").Value = $env:MAVEN_GPG_PLUGIN_VERSION
$elExecutionSignArtifacts = $elPluginSignArtifacts.Element($ns + "executions").Elements($ns + "execution").Where({$_.Element($ns + "id").Value -eq "sign-artifacts"})[0]
$elExecutionSignArtifacts.Add($elConfiguration)

$doc.save($path)
