package maze;

import java.util.Iterator;

// Make generic + abstract maze, then do intMaze. (?)
public class Maze extends Object /*implements Iterable<Integer>*/ {
	// array + some functions.
	public Integer[][] data; 	// TODO: public -> might be a bit dangerous. (?)
	public final int width;
	public final int height;
	
	Maze(int width, int height) {
		this.height = height;
		this.width  = width;
		data = new Integer[height][width];
	}
	
	/*public Iterator<Integer> iterator() {
		return new MazeIterator(this);
	}*/
	
	public String toString() {
		String s = "";
		
		System.out.println("to implement...");
		
		return s;
	}
	
	
}
