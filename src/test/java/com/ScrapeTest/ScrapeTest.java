package com.ScrapeTest;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ScrapeTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ScrapeTest1.class);
		RuneLite.main(args);
	}
}