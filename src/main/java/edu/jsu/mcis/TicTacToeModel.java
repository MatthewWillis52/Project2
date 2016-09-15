package edu.jsu.mcis;

public class TicTacToeModel {
	private int[][] grid;
	private int turnCounter;
	public String winMessage = "";
	public TicTacToeModel() {
		grid = new int[3][3];
		turnCounter = 0;
	}
	
	public String getMark(int row, int col) {
		if(grid[row][col] == 0) return "";
		else if(grid[row][col] == 1) return "X";
		else return "O";
	}
	
	public void makeMark(int row, int col) {
		if(grid[row][col] == 0) {
			if(turnCounter % 2 == 0) grid[row][col] = 1;
			else grid[row][col] = 2;
			turnCounter++;
		}
	}
	
	public void clearGrid(){
		turnCounter = 0;
		for (int i = 0; i<grid.length; i++){
			for (int j = 0; j < grid.length; j++){
				grid[i][j]=0;
			}
		}
	}

	private String getWinnerDiagonally(){
		if(grid[0][0] == grid[1][1] && grid[0][0] == grid[2][2] && grid[0][0] !=0 || grid[0][2] == grid [1][1] && grid[0][2] == grid[2][0] && grid [0][2] != 0){
			winMessage = getMark(1,1) ;
		}
		return winMessage;
	} 

	private String getWinnerHorizontally(){
		if(grid[0][0] == grid [0][1] && grid[0][1] == grid[0][2] && grid[0][0] != 0 ){
			winMessage = getMark(0,0);
		}
		else if(grid[1][0] ==  grid[1][1] && grid[1][1] == grid[1][2] && grid[1][1] !=0){
			winMessage = getMark(1,1);
		}
		
		else if(grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2] && grid[2][1] != 0){
			winMessage= getMark(2,1);
		} 
		return winMessage;
	}
	
	private String getWinnerVertically(){
		
		if(grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0] && grid[2][0] != 0){
			winMessage = getMark(0,0);
		}
		else if(grid[0][1] == grid[1][1]&& grid[1][1] == grid[2][1] && grid[0][1] != 0 ){
			winMessage = getMark(1,1);
		}
		else if(grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2] && grid[1][2] != 0){
			winMessage = getMark(1,2);
		}
		return winMessage;
	}


	private boolean isTie(){
		return turnCounter == 9;
	}
	
	
	public String getWinner() {
		String h = getWinnerHorizontally();
		String v = getWinnerVertically();
		String d = getWinnerDiagonally();
		if(h.length() > 0) return h;
		else if(v.length() > 0) return v;
		else if(d.length() > 0) return d;
		else if(isTie()) return "TIE";
		else return "";
	}
	
		
	
}













