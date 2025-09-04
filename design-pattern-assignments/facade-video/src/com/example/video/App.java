package com.example.video;

import java.nio.file.Path;

public class App
{
	public static void main(String[] args)
	{
		VideoPipelineFacade facade = new VideoPipelineFacade();

		Path out = facade.process(Path.of("in.mp4"), Path.of("out.mp4"), true, Double.valueOf(0.5), Integer.valueOf(3));
		System.out.println("Wrote " + out);
	}
}
