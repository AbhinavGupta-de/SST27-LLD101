package com.example.notifications;

/**
 * Adds SMS notification behavior.
 */
public class SmsDecorator extends NotifierDecorator
{
	private final String phoneNumber;

	public SmsDecorator(Notifier wrapped, String phoneNumber)
	{
		super(wrapped);
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void notify(String text)
	{
		super.notify(text);
		System.out.println("[SMS -> " + phoneNumber + "]: " + text);
	}
}
