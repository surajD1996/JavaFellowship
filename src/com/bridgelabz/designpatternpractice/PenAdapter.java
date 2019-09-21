package com.bridgelabz.designpatternpractice;

import com.bridgelabz.designpatterns.PilotPen;

public class PenAdapter implements Pen 
{

	PilotPen pp = new PilotPen();
	
	@Override
	public void write(String str) 
	{
		pp.mark(str);
		
	}
}
