package edu.jsu.mcis;

public class TicTacToeModel {
	private int[][] grid;
	public int Turncounter;
	public boolean win;
	public String winMessage;
	public boolean AllTileFilled;
	public int TheTurnCount;
	
	public TicTacToeModel() {
		grid = new int[3][3];
	}
	
	public String getMark(int row, int col) {
		if(grid[row][col] == 0) return "";
		else if(grid[row][col] == 1) return "X";
		else return "O";
	}
	public boolean checktheHorizontalWin(){
		for(int j = 0; j < 3; j++){
			
			if(getMark(0,j).equals("X") || getMark(0,j).equals("O")){
					win = true;
				
				}
			else if (getMark(0,j).equals("X") || getMark(0,j).equals("O")){
				win = true;}
			else if (getMark(0,j).equals("X") || getMark(0,j).equals("O")){
				win = true;}
			else if (getMark(0,j).equals("X") || getMark(0,j).equals("O")){
				win = true;}
			
			else win = false;	
			}
		return win;
	}
	public boolean isTheGameStillRunning(){
		if(Turncounter == 9){
			return false;
		}
		else{
			return true;
		}
	}
	public void makeMark(String mark, int row, int col) {
		if(grid[row][col] == 0) {
			if(mark.equals("X")) grid[row][col] = 1;
			else if(mark.equals("O")) grid[row][col] = 2;
			else if(mark.equals("")) grid[row][col] = 0;
		}
		Turncounter++;
	}
	public void cleartheGrid(){
		TheTurnCount = 0;
		for (int i = 0; i<grid.length; i++){
			for (int j = 0; j < grid.length; j++){
				grid[i][j]=0;
			}
		}
	}
	public boolean CheckAllSpacesToBeFilled(){
		for(int i = 0; i < 3; i++){
			for(int j = 0;j< 3; j++){
				if(grid[i][j] == 2){
					AllTileFilled = false;
				}
			}
		}
		return true;
	}
	public String GetWinnerDiagonally(){
		if(grid[0][0] == grid[1][1] && grid[0][0] == grid[2][2] && grid[0][0] !=0 || grid[0][2] == grid [1][1] && grid[0][2] == grid[2][0] && grid [0][2] != 0){
			
				winMessage = getMark(1,1) ;
		
		}
		return winMessage;
	} 
	public String GetWinnerHorizontally(){
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
	
	public String GetWinnerVertically(){
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


	public String ForcetheTie(){
		for (int i = 0; i < 0; i++){
			for(int j =0; j < 0; j++){
				if((getMark(i,j).equals("X") || getMark(i,j).equals("O")) && TheTurnCount == 9){
					winMessage = "TIE";
				}
			}
		}
		return winMessage;
	}
	
	
	
	
		
	
}













