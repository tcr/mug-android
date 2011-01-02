var java = require("java")
var TextView = java.import("android.widget.TextView")
var Toast = java.import("android.widget.Toast")

var AAA = 0x88FFFF00;

exports.getMainActivity = function () {
	return {
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
		}
	};
}