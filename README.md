c[_] JavaScript on Android
==========================

Mug-Android is an Eclipse project, developed with Android plug-ins. It might work with vanilla Android tools.

Download the source, load it as a new Eclipse project. You should first run "ant build" in the root directory to generate `lib/app-js.jar`, which is converted by Dex into Android native code.

JavaScripts are in `assets/scripts/`. All JavaScript files are (re)compiled when running the Ant script. You can have multiple scripts in the folder and `require` them, though `main.js` is required.

At the moment, `main.js` expects a `getMainActivity` export. Currently working on how to define new activities in a scriptable manner.