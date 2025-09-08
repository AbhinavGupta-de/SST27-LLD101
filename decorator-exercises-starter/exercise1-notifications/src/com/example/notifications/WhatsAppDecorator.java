package com.example.notifications;

/**
 * Adds WhatsApp notification behavior.
 */
public class WhatsAppDecorator extends NotifierDecorator
{
	private final String waId;

	public WhatsAppDecorator(Notifier wrapped, String waId)
	{
		super(wrapped);
		this.waId = waId;
	}

	@Override
	public void notify(String text)
	{
		super.notify(text);
		System.out.println("[WHATSAPP -> " + waId + "]: " + text);
	}
}
