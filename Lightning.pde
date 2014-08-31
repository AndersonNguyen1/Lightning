int startX = 0;
int startY = 0;
int endX = 0;
int endY;

int canvasSize = 500;

int cloudX = 0;

int x = 0;
int y = 0;

void setup()
{
    size(canvasSize, canvasSize);
    strokeWeight(3);
    background(0);
}

void draw()
{
	
}

void drawLighting()
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

void mousePressed()
{
	stroke(random(255), random(255), random(255));
    drawLighting();
    drawClouds();
    endX = 0;
    endY = 0;
    startX = (int)(Math.random()*canvasSize);
    startY = 0;
}

void drawClouds()
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
