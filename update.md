# Updating Minecraft Version

## Workflows

### Gradle-Publish
`.github/workflows/gradle-publish.yml`
> "actions/checkout@v?" -> https://github.com/actions/checkout<br>
> "actions/setup-java@v?" -> https://github.com/actions/setup-java<br>
> "gradle/actions/setup-gradle@v?" -> https://github.com/gradle/actions<br>

## Paper
`src/main/resources/paper-plugin.yml`> "api-version"<br>
`build.gradle` > "dependencies" > "io.papermc.paper:paper-api:"<br>
-> https://papermc.io/downloads/paper & https://repo.minebench.de/io/papermc/paper/paper-api/<br>
`build.gradle` > "targetJavaVersion"<br>-> https://github.com/MultiMC/Launcher/wiki/Using-the-right-Java & https://en.wikipedia.org/wiki/Java_version_history<br>

## Gradle
[Compability Matric](https://docs.gradle.org/current/userguide/compatibility.html)<br>
Follow gradles upgrade instructions on https://github.com/gradle/gradle/releases<br>

## `build.gradle`

### Plugins
`build.gradle` > "plugins" > "me.qoomon.git-versioning"<br>-> https://plugins.gradle.org/plugin/me.qoomon.git-versioning<br>

### Dependencies
__Could also be used in PluginsLoader clases__<br>

Command-API: https://docs.commandapi.dev/dev-setup/shading#shading-with-build-system<br>
Placeholder API: https://github.com/PlaceholderAPI/PlaceholderAPI/releases<br>
Luckperms: https://github.com/LuckPerms/LuckPerms/tags<br>
Authlib: https://mvnrepository.com/artifact/com.mojang/authlib<br>
