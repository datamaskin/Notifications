package com.boundary.rest;

public class User {

	int user_id;
	int timestamp;
	String message;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", timestamp=" + timestamp + ", message=" + message + "]";
	}

}