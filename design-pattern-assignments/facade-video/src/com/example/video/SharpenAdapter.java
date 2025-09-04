package com.example.video;

public class SharpenAdapter
{
	private final LegacySharpen legacy;

	public SharpenAdapter(LegacySharpen legacy)
	{
		this.legacy = legacy;
	}

	public Frame[] sharpen(Frame[] frames, int strength)
	{
		String handle = "FRAMES_HANDLE";
		String newHandle = legacy.applySharpen(handle, strength);
		return frames;
	}
}
