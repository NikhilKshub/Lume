# Lume

Lume is a local-first Android music player for audio stored on your device.

This initial phase provides the AMOLED dark theme and a three-tab navigation shell. Playback, media scanning, lyrics, and storage are intentionally not included yet.

## Requirements

- Android Studio Ladybug or newer
- JDK 17 (bundled with Android Studio)
- An Android device running Android 8.0 (API 26) or newer

## Run

1. Open this folder in Android Studio.
2. Let Gradle sync and install any requested Android SDK platform.
3. Enable Developer options and USB debugging on your phone, then connect it by USB (or pair it wirelessly).
4. Choose the device from the target selector and press **Run**.

From PowerShell, with the Android SDK and platform tools configured, the equivalent command is:

```powershell
.\gradlew.bat installDebug
```

The bundled Plus Jakarta Sans font is licensed under the SIL Open Font License 1.1.
