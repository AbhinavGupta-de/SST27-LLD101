package com.example.notifications;

/**
 * Base decorator that wraps another Notifier. Concrete decorators should extend this.
 */
public abstract class NotifierDecorator implements Notifier
{
	protected final Notifier wrapped;

	public NotifierDecorator(Notifier wrapped)
	{
		this.wrapped = wrapped;
	}

	@Override
	public void notify(String text)
	{
		if (wrapped != null)
		{
			wrapped.notify(text);
		}
	}
}
