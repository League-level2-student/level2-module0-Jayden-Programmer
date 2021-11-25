package arrays;

import java.util.Iterator;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Robot[] robs = new Robot[5];
		Random ran = new Random();
		int[] angles = new int[5];
		boolean gameon = true;
		for (int i = 0; i < robs.length; i++) {
			robs[i] = new Robot("mini");
			angles[i] = 0; 
			robs[i].setX(250 + i * 100);
			robs[i].setY(550);
			robs[i].setSpeed(100000);
			
		}
		while (gameon) {

			for (int i = 0; i < robs.length; i++) {
				robs[i].move(ran.nextInt(50));
				int turns = ran.nextInt(50); 
				for (int j = 0; j < turns; j++) {
					robs[i].move(1);
					robs[i].turn(1);
					angles[i] += 1;
					if (angles[i] == 360) {
						gameon = false;
						JOptionPane.showMessageDialog(null, "robot #" + (i + 1) + " is the winner!");
						break;
				}
				}
			}
		}
	}
}

// 2. create an array of 5 robots.

// 3. use a for loop to initialize the robots.

// 4. make each robot start at the bottom of the screen, side by side, facing up

// 5. use another for loop to iterate through the array and make each robot move
// a random amount less than 50.

// 6. use a while loop to repeat step 5 until a robot has reached the top of the
// screen.

// 7. declare that robot the winner and throw it a party!

// 8. try different races with different amounts of robots.

// 9. make the robots race around a circular track.
