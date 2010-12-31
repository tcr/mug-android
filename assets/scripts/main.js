var java = require("java")
var TextView = java.import("android.widget.TextView")
var Toast = java.import("android.widget.Toast")

exports.getMainActivity = function () {
	return new java.Proxy("mug.android.ActivityListener",
	{
		onCreate: function (activity, bundle) {
			var view = new TextView(activity);
			activity.setContentView(view);
			view.append("Hello Android!");
			view.setBackgroundColor(0x88FFFF00);
			
			var toast = Toast.makeText(
				activity.getApplicationContext(),
				"Welcome to JavaScript on Android.",
				Toast.LENGTH_SHORT
			);
			toast.show();
		}
	});
}