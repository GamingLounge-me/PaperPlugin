# Paper Plugin
This is an Template for Java Minecraft Paper plugins.
This is spezialised for the GamingLounge organisation but can be used by anyone.
Things other users should replace/remove:
- gradle-publish workdlow: enviroment variables
- build.gradle
    - group
    - Repostitories
    - publishing -> repositories

## gradle settings

### settings.gradle

- configure projekt name

### build.gradle

plugins are prepared for java, publishing jar files to maven server and using versioning via git.

#### versioning

the `version` field will be overwritten by gitversioning so there is no need to change it.

gitversioning will convert tag "vx.x.x"/"devx.x.x" to the version "x.x.x"/"devx.x.x", if no tag is used while building the latest sommit short (eg. e4b15fc) and "-SNAPSHOT" so the possible outcomes are:
"NAME-x.x.x", "NAME-devx.x.x" and NAME-SHORT-SNAPSHOT"

#### java version

The Java version can be changed by editing this line:
```
def targetJavaVersion = 25
```

#### publishing jars to maven server

The GitHubPackages repositories should always be available
Other repositories can be added inside the repository array (`repository{...}`)

### Generating gradle building files

The generated files should be uploaded to github as they are used by the github runner and other users to build the project. 

```
gradle wrapper
```

## workflows

### gradle publish

By default this workflow triggers when an tag that stars with "v" or "dev" is created and only runs on self-hosted runners.

## Java class paths and files

change the folder structure and main.jar, then the corrosponding class paths in the former main.jar.
