package Queue;

import java.util.LinkedList;
import java.util.Queue;


public class CountOfIslands {
	
	public static void main(String[] args) {
		
		char[][] grid = {{}};
		int a = numIslands(grid);
		System.out.println(a);
	}
	
    public static int numIslands(char[][] grid) {
     
        
    	Queue<int[]> queue = new LinkedList(); 
    	int count = 0;
    	
    	int height =  grid.length;

    	
    	if(height == 0) return 0;
    	int width = grid[0].length;
    	for(int i = 0;i < height; i++) {
    		for (int j = 0; j < width; j++) {
				if (grid[i][j] == '1') {
					count += 1;
					int[] location = new int[2];
					location[0] = i;
					location[1] = j;
					queue.offer(location);
					while(!queue.isEmpty()) {
						int size = queue.size();
						for (int k = 0; k < size; k++) {
							int[] currentNode = queue.peek();
							int x = currentNode[0];
							int y = currentNode[1];
							add(x+1, y, queue, grid);
							add(x-1, y, queue, grid);
							add(x, y+1, queue, grid);
							add(x, y-1, queue, grid);
							queue.poll();
						}
					}
					
				}
			}
    	}
        return count;
    }

    public static void add(int x, int y, Queue<int[]> queue, char[][] grid) {

    	int height =  grid.length;
    	int width = grid[0].length;
    	int[] location = new int[2];
    	location[0] = x;
    	location[1] = y;
    	if(0 <= x && x < height && 0 <= y && y <width && grid[x][y] == '1') {
    		queue.offer(location);
    		grid[x][y] = '0';
    	}
    		
 
    }
}
