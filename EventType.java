package org.com;
@SuppressWarnings("serial")
public class EventType extends RuntimeException {
	String exceptionMessage = "EventTypeDoesNotExistsException: No event type available with the given id";

	public EventType() {
	}

	public EventType(String msg) {
		this.exceptionMessage = "EventTypeDoesNotExistsException: " + msg;
	}

	public String toString() {
		return this.exceptionMessage;
	}
}




