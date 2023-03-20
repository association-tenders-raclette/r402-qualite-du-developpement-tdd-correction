package fr.univ_amu.but.r4_02;

import fr.univ_amu.but.r4_02.exception.AlreadyTickedField;

public class TicTacToe {
    Grid grid;
    Player player1;
    Player player2;

    Player lastPlayer;

    WinningValidator winningValidator;

    public TicTacToe() {

    }

    public void tick(Player player, Position position) throws AlreadyTickedField {

    }

    public Player getLastPlayer() {
        return lastPlayer;
    }

    private boolean isFinished() {
        return false;
    }

    public Player whoWon() {
        return null;
    }

    private Player lineWinner() {
        return null;
    }

    private Player columnWinner() {
        return null;
    }

    private Player diagonalWinner() {
        return null;
    }

    private Player playerByTick(Tick tick) {
        return null;
    }
}
