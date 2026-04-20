@rem ---------------------------------------------------------------------------
@rem Gradle startup script for Windows
@rem ---------------------------------------------------------------------------

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem  Gradle startup script for Windows
@rem ##########################################################################

@rem Set local scope for the variables with windows.exe
setlocal EnableDelayedExpansion

@rem Resolve any "." and ".." in %GRADLE_HOME% to the full path
set GRADLE_HOME=%~dp0
if exist "%GRADLE_HOME%gradle\bin" (
  set GRADLE_HOME=%GRADLE_HOME%gradle
) else if exist "%GRADLE_HOME%..\gradle\bin" (
  set GRADLE_HOME=%GRADLE_HOME%..\gradle
)

@rem Add local gradle binaries to PATH
set GRADLE_BIN=%GRADLE_HOME%\bin
if not exist "%GRADLE_BIN%" (
  echo Gradle binary directory not found: %GRADLE_BIN%
  echo Please ensure Gradle is downloaded and extracted correctly.
  exit /b 1
)
set PATH=%GRADLE_BIN%;%PATH%

@rem Check if Java is available
java -version >nul 2>&1
if errorlevel 1 (
  echo Java is not installed or not in PATH.
  echo Please install Java 8 or higher.
  exit /b 1
)

@rem Run Gradle
gradle %*
