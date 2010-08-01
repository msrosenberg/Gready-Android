package com.caspergasper.android.goodreads;

import android.graphics.Bitmap;

public class Update {
	String updateText;
	String username;
	String body;
	int id;
	String updateLink;
	Bitmap bitmap;
	String imgUrl;
	
	Update(String text) {
		updateText = text;
	}
	
	public String toString() {
		// Strip off username if it's included in the update.
		// Can username be null?
		String response;
		int usernameLength = username.length();
		if(username.compareToIgnoreCase(updateText.substring(0, usernameLength)) 
				== 0) {
			response = "<b>" + username + "</b> " + updateText.substring(usernameLength);
		} else {
			response  = "<b>" + username + "</b> " + updateText;
		}
		
		if(body == null) {
			return response;
		} else {
			return response + "<br/><br/>" + body;
		}
	}
	
}
