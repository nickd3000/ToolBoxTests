package tests;

import java.awt.Color;

import ToolBox.BasicDisplay;

public class TestBasicDisplay {

	public void runTests() {

		testCard();
		//example_colourWheel();

	}
	
	public void example_colourWheel() {
		BasicDisplay bd = new BasicDisplay(400, 400);
		double angle = 0, phi=0;
		while (true) {
			//bd.startTimer();
			bd.cls(Color.GRAY);
			double a=0,r=20;
			bd.drawFilledCircle(bd.mouseX(), bd.mouseY(), 50);
			for (int i=0;i<20;i++) {
				bd.setDrawColor(bd.getDistinctColor(i, 0.75f));
				bd.drawFilledRect(i*20, 0, 20+(i*20), 20);
			}			
			for (int i=0;i<60;i++) {
				phi = 0.61803398874 + (Math.sin(angle/10.0)*1.5);
				a = (Math.PI*0.5) * phi * (double)i;
				r+=2;
				int x = (int)(Math.sin(a+angle)*r);
				int y = (int)(Math.cos(a+angle)*r);
				bd.setDrawColor(bd.getDistinctColor(i, 0.75f));
				bd.drawFilledCircle(x+200, y+200, 15);
			}
			angle+=0.01;
			bd.refresh(60);
			
			//while (bd.getEllapsedTime()<1000/10) {};
		}
	}
	
	public void testCard() {
		BasicDisplay bd = new BasicDisplay(400, 400);

		bd.cls(bd.getDistinctColor(0, 0.25f));
		bd.setDrawColor(bd.getDistinctColor(1, 0.75f));
		bd.drawLine(10, 50, 10+20, 50+0);
		bd.drawRect(30, 50, 30+20, 50+20);
		bd.setDrawColor(bd.getDistinctColor(2, 0.75f));
		bd.drawCircle(60, 50, 20);
		bd.drawLine(10, 80, 10+50, 80+50, 10);
		bd.setDrawColor(bd.getDistinctColor(3, 0.75f));
		bd.drawLine(0,0, 400,400);
		bd.setDrawColor(bd.getDistinctColor(4, 0.75f));
		bd.drawLine(400,0,0,400);
		bd.setDrawColor(bd.getDistinctColor(6, 0.75f));
		bd.drawRect(100, 100, 300, 300);
		bd.refresh();

	}

}
