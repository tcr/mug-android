var java = require("java")
var TextView = java.import("android.widget.TextView")
var Toast = java.import("android.widget.Toast")
var Handler = java.import("android.os.Handler")
var Log = java.import("android.util.Log")

exports.getMainActivity = function () {
	return {
		handler: new Handler(),
		
		onCreate: function (bundle) {
			var view = new TextView(this);
			this.setContentView(view);
			view.append("Welcome to Mug on Android!");
			view.setTextColor(0xFF000000);
			view.setBackgroundColor(0xFFFF0000);
			
			var toast = Toast.makeText(
				this.getApplicationContext(),
				"This is an alert!",
				Toast.LENGTH_SHORT
			);
			toast.show();
			
			var activity = this
			setInterval(function () {
				activity.handler.post(function () {
					view.append("\nUI Thread update!")
				});
			}, 1000);
		}
	};
}