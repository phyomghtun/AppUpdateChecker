# AppUpdater

[![](https://jitpack.io/v/phyomghtun/AppUpdateChecker.svg)](https://jitpack.io/#phyomghtun/AppUpdateChecker)

**AppUpdater** is a library designed to help Android developers easily check for app updates and notify users when a new version is available. It simplifies the process of managing app updates, ensuring your users are always on the latest version.

## Features

- **Automatic Update Checks**: Automatically checks for new versions of the app.
- **User Notifications**: Notifies users when an update is available.
- **Easy Integration**: Simple setup and usage.

## Installation

To integrate **AppUpdater** into your Android project, follow these steps:

### 1. Configure JitPack Repository

Add JitPack as a repository in your root `build.gradle` file. Insert the following code at the end of the `repositories` section:

```groovy
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```

### 2. Add the dependency

```groovy
dependencies {
	        implementation 'com.github.phyomghtun:AppUpdateChecker:1.0.0'
	}
```
