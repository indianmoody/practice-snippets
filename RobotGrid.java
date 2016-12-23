package mini2;

// move robot from top left corner to bottom right corner. some cells are invalid, i.e. value is -1. 
// robot can only move in right and down directions.

import java.util.*;

public class RobotGrid {
	
	private static int[][] grid;
	static ArrayList<String> path = new ArrayList<String>();
	private static int row, col;
	
	public static boolean traverse(int i, int j) {
		if (!isValid(i, j))
			return false;
		
		String point;
		
		if (i==row-1 && j==col-1) {
			point = "(" + i + ", " + j + ")";
			path.add(point);
			return true;
		}
		
		if (traverse(i, j+1)) {
			point = "(" + i + ", " + j + ")";
			path.add(point);
			return true;
		}
		else if (traverse(i+1, j)) {
			point = "(" + i + ", " + j + ")";
			path.add(point);
			return true;
		}
		else
			return false;
	}
	
	public static boolean isValid(int i, int j) {
		if (i<row && j<col && grid[i][j]>=0) 
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		row = 4; col = 5;
		grid = new int[row][col];
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				grid[i][j] = 0;
			}
		}
		grid[0][1] = -1;
		grid[1][3] = -1;
		grid[2][3] = -1;
		
		
		if (traverse(0, 0)) {
			Collections.reverse(path);
			System.out.println(path.toString());
		}
		else {
			System.out.println("no valid path!");
		}

	}

}
