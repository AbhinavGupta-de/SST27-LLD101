package com.example.profiles;

/**
 * Assembles profiles with consistent, centralized validation.
 */
public class ProfileService
{
	// returns a fully built immutable profile
	public UserProfile createMinimal(String id, String email)
	{
		return new UserProfile.UserProfileBuilder(id, email).build();
	}

	public UserProfile createWithDisplayName(String id, String email, String displayName)
	{
		UserProfile.UserProfileBuilder builder = new UserProfile.UserProfileBuilder(id, email);
		if (displayName != null && displayName.length() > 100)
		{
			displayName = displayName.substring(0, 100);
		}
		builder.withDisplayName(displayName);
		return builder.build();
	}
}
