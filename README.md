c[_] JavaScript on Android
==========================

Project is an Eclipse project, developed with Android plug-ins. It should probably work with vanilla Android tools.

JavaScripts are in `assets/scripts/`. All JavaScript files are compiled; `main.js` expects a `getMainActivity` export.

After editing your scripts, run build.xml, which compiles your scripts into `lib/app-js.jar`. (Eclipse probably expects a refresh each compilation.)
Then load to Android.