c[_] JavaScript on Android
==========================

Project is an Eclipse project, developed with Android plug-ins. It might work with vanilla Android tools.

Download the source and load it as a new Eclipse file. You should first run "ant build" in the root directory to generate `lib/app-js.jar`.

JavaScripts are in `assets/scripts/`. All JavaScript files are (re)compiled when running the Ant script.

At the moment, `main.js` expects a `getMainActivity` export. Currently working on how to define new activities in a scriptable manner.