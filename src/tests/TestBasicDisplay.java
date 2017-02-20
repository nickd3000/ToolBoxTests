package tests;

import java.awt.Color;

import ToolBox.BasicDisplay;

public class TestBasicDisplay {

	public void runTests() {
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

		//Color cn = Color.HSBtoRGB(hue, 1.0f, 1.0f);
		
		/*
		bd.setDrawColor(Color.black);
		while (true) {
			for (int i=0;i<400;i++) {
				bd.cls(new Color(255,255,0,0));
				bd.cls(new Color(255,255,0,0));
				bd.cls(new Color(255,255,0,0));
				bd.cls(new Color(255,255,0,0));
				bd.cls(new Color(255,255,0,0));
				bd.setDrawColor(new Color(Color.HSBtoRGB((float)i/400.0f*1.6180f, 1.0f, 1.0f)));
				bd.drawLine(0,i,400,i);
				bd.refresh();
				
			}
		}*/
	}

}
