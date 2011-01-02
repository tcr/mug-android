package mug.android;

import java.util.WeakHashMap;

import android.app.Application;

public class MugApplication extends Application {
	WeakHashMap<String, Object> state = new WeakHashMap();
	
	public <T> T getState(String name) {
		try {
			return (T) state.get(name);
		} catch (ClassCastException e) {
			return null;
		}
	}
	
	public <T> void putState(String name, T value) {
		state.put(name, value);
	}
}
