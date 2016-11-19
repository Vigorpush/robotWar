package model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Tile {

	public int xPosition;
	public int yPosition;
	public List<Robot> robotList;
	
	public Tile(int x, int y)
	{		
		xPosition = x;
		yPosition = y;
		robotList = new LinkedList<Robot>();
	}
	
	public void addRobot(Robot newRobot)
	{		
		robotList.add(newRobot);
		newRobot.location= this;
	}
	public void removeRobot(int index){
		robotList.remove(index);
	}
	
	public void updateRobot(Robot newRobot){
		boolean done = false;
		int i = 0;
		Iterator<Robot> test = robotList.iterator();
		while(test.hasNext() && !done){			
			if(robotList.get(i).id == newRobot.id){
				robotList.set(i, newRobot);
				done = true;
			}			
			i++;			
			test.next();

			
		}
	}
	
	public Robot getRobot(int x){
		return robotList.get(x);
	}
}