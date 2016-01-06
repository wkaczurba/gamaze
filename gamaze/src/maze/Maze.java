package maze;

import java.util.Iterator;

class MazeIterator implements Iterator<Integer> {
	int i,j;
	Maze m;
	
	MazeIterator(Maze m) {
		this.i = 0;
		this.j = 0;
		this.m = m;
	}
	
	@Override
	public boolean hasNext() {
		// FIXME: Check for size (maze can be of size 0)
		
		if (i != m.width - 1 && j != m.height - 1)
			return true;

		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return null;
	}
}

// Make generic + abstract maze, then do intMaze. (?)
public class Maze extends Object implements Iterable<Integer> {
	// array + some functions.
	public Integer[][] data; 	// TODO: public -> might be a bit dangerous. (?)
	public final int width;
	public final int height;
	
	Maze(int width, int height) {
		this.height = height;
		this.width  = width;
		data = new Integer[height][width];
	}
	
	public Iterator<Integer> iterator() {
		return new MazeIterator(this);
	}
	
	public String toString() {
		String s = "";
		
		System.out.println("");
		
		return s;
	}
	
	
}
