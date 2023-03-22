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

    /**
     *
     * @param position La position du champ à marquer
     * @param tick Le tick à mettre sur le champ
     * @throws AlreadyTickedField Si le champ est déjà marqué
     * @throws IllegalArgumentException Si la position est hors de la grille
     */
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
