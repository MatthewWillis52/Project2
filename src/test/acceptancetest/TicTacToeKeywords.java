package keywords;

import edu.jsu.mcis.*;

public class TicTacToeKeywords {
    private TicTacToeModel model;
    private boolean turn;
    
    public void startNewGame() {
        model = new TicTacToeModel();
        turn = true;
		model.cleartheGrid();
    }
    
    public void markLocation(int r, int c) {
        String m = (turn)? "X" : "O";
        model.makeMark(m, r, c);
        turn = !turn;
    }
    
    public String getMark(int r, int c) {
        return model.getMark(r, c);
    }
    
    public String getWinner() {
        return "X";
    }
}



