package tests;

import java.awt.Color;

import ToolBox.BasicDisplay;
import ToolBox.BasicGraph;

public class TestBasicGraph {

	public void runTests() {
		BasicDisplay display = new BasicDisplay(640, 480);
		BasicGraph graph = new BasicGraph(1000); 
		double i=0;
		while (1==1) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i+=0.01;
			graph.addData(Math.sin(i)+Math.sin(i/2.1)+Math.sin(i*4.1)*2);
			display.cls(Color.gray);

			graph.draw(display, 50, 50, 300, 100, Color.blue);
			display.refresh();
		}
	}
	
}
