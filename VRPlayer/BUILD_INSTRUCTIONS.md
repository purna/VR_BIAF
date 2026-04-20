# Building the APK - Windows Instructions

## Option 1: Using Android Studio (Easiest)

1. Open Android Studio.
2. Click **File > Open** and select the `VRPlayer` folder.
3. Wait for Gradle sync to complete (may download dependencies).
4. Connect your Android device via USB with USB debugging enabled, or create an AVD emulator.
5. Click the **Run** button (green play icon) or press **Shift+F10**.
6. The app will be built and installed on your device.

**APK location after build:**
`VRPlayer\app\build\outputs\apk\debug\app-debug.apk`

## Option 2: Using Command Prompt / PowerShell

If you have **Android Studio** installed, use the bundled Gradle:

```cmd
cd VRPlayer
.\gradlew.bat assembleDebug
```

If you don't have the Gradle wrapper set up yet, you need to either:
- Install Gradle manually from https://gradle.org/install/ and run `gradle assembleDebug`
- Or use Android Studio as in Option 1 (recommended)

## Option 3: Quick APK Generation with Online Tools

If you don't want to install Android Studio, you can:
1. Upload this project to a CI/CD service like GitHub Actions, Bitrise, or Codemagic
2. Or use a local APK builder service

But for simplest results, use Android Studio.

## Once the APK is built

Transfer `app-debug.apk` to your Android VR headset (Quest, etc.) and install it (enable "Install from unknown sources" in settings if needed).
