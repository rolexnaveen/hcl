package com.test;

import javax.naming.InsufficientResourcesException;

public class Exceptional extends InsufficientResourcesException
{
	public String message;
	Exceptional()
	{
		super();
	}
	public Exceptional (String message)
	{
		super();
		this.message=message;
	}

}
