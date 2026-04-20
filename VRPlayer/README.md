# VR Player APK

An Android app that loads the VR web application `https://purna.github.io/VR_BIAF/` in a full-screen WebView with WebXR support for VR headsets.

## Project Structure

```
VRPlayer/
├── app/
│   ├── build.gradle
│   └── src/main/
│       ├── AndroidManifest.xml
│       ├── java/com/example/vrplayer/MainActivity.kt
│       └── res/
│           ├── layout/activity_main.xml
│           ├── values/strings.xml
│           └── values/themes.xml
├── build.gradle
├── settings.gradle
└── gradle.properties
```

## Build Instructions

### Using Android Studio (Recommended)

1. Open Android Studio.
2. Select **File > Open** and navigate to the `VRPlayer` folder.
3. Click **OK** to import the project.
4. Wait for Gradle sync to complete.
5. Connect an Android device (with USB debugging enabled) or start an emulator.
6. Click **Run > Run 'app'** or press **Shift+F10**.
7. The APK will be built and installed automatically.

The debug APK will be located at: `app/build/outputs/apk/debug/app-debug.apk`

### Using Command Line

If you have Gradle installed:

```bash
cd VRPlayer
./gradlew assembleDebug   # Linux/macOS
gradlew.bat assembleDebug # Windows
```

If you don't have the Gradle wrapper, run `gradle wrapper` first to generate it.

The APK will be at: `VRPlayer/app/build/outputs/apk/debug/app-debug.apk`

Transfer the APK to your Android device and install it (enable "Install from unknown sources" if needed).

## Features

- Full-screen WebView loading the VR_BIAF web app
- JavaScript and DOM storage enabled
- WebXR support for VR headsets (e.g., Google Cardboard, Meta Quest browser mode)
- Landscape orientation for VR viewing
- Back button support for WebView navigation

## Notes

- Internet permission is required to load the web content.
- The app uses clear text traffic permitted for compatibility.
- Minimum SDK: Android 7.0 (API 24)
