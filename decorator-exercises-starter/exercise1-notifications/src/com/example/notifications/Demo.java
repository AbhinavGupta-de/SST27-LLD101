package com.example.notifications;

/**
 * Starter demo that uses only the existing Email notifier.
 * TODOs guide you to add decorators and compose them.
 */
public class Demo
{
	public static void main(String[] args)
	{
		Notifier base = new EmailNotifier("user@example.com");

		base.notify("Baseline email only.");

		Notifier emailAndSms = new SmsDecorator(base, "+91-99999-11111");
		emailAndSms.notify("Build green");

		Notifier emailAndWa = new WhatsAppDecorator(base, "user_wa");
		emailAndWa.notify("Integration tests passed");

		Notifier emailAndSlack = new SlackDecorator(base, "#alerts");
		emailAndSlack.notify("Hotfix deployed");

		Notifier full = new SlackDecorator(new WhatsAppDecorator(base, "user_wa"), "deployments");
		full.notify("Deployment completed");
	}
}
