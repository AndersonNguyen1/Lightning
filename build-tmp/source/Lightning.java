import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = 0;
int startY = 0;
int endX = 0;
int endY;

int canvasSize = 500;

int cloudX = 0;

int x = 0;
int y = 0;

public void setup()
{
    size(canvasSize, canvasSize);
    strokeWeight(3);
    background(0);
}

public void draw()
{
	
}

public void drawLighting()
{
	while (endY < 500)
	{
		endX = startX + (int)(Math.random()*20 - 10);				
		endY = startY + (int)(Math.random()*20);		
		line (startX,startY,endX,endY);				
		startX = endX;						
		startY = endY;								
	}
}

public void mousePressed()
{
	stroke(random(255), random(255), random(255));
    drawLighting();
    drawClouds();
    endX = 0;
    endY = 0;
    startX = (int)(Math.random()*canvasSize);
    startY = 0;
}

public void drawClouds()
{
	fill(255);
	stroke(255);
	while (cloudX < canvasSize) 
	{
		ellipse(x, y, 100, 100);
		x+=70;
		cloudX++;
	}
	cloudX = 0;
	x = 0;
	y = 0;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
