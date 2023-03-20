package fr.univ_amu.but.r4_02;

import fr.univ_amu.but.r4_02.exception.AlreadyTickedField;

import java.util.HashMap;
import java.util.List;

public class Grid {
    private final int taille;
    private final HashMap<Position, Field> grid;

    public Grid(int taille) {
        this.taille = taille;
        grid = null;
    }

    public void tick(Position position, Tick tick) throws AlreadyTickedField {

    }


    public boolean isFull() {
        return false;
    }

    public List<List<Field>> lines() {
        return null;
    }

    private List<Field> line(int x) {
        return null;
    }

    public List<List<Field>> columns() {
        return null;
    }

    private List<Field> column(int y) {
        return null;
    }

    public List<List<Field>> diagonals() {
        return null;
    }

    private List<Field> diagonal() {
        return null;
    }

    private List<Field> reverseDiagonal() {
        return null;
    }
}
