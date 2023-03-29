package fr.univ_amu.but.r4_02;

import fr.univ_amu.but.r4_02.exception.AlreadyTickedField;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Grid {
    private final int taille;
    private final HashMap<Position, Field> grid;

    public Grid(int taille) {
        this.taille = taille;
        grid = new HashMap<>();
        for(int x = 0; x < taille; ++x) {
            for (int y = 0; y < taille; ++y) {
                grid.put(new Position(x, y), new Field());
            }
        }
    }

    /**
     *
     * @param position La position du champ à marquer
     * @param tick Le tick à mettre sur le champ
     * @throws AlreadyTickedField Si le champ est déjà marqué
     * @throws IllegalArgumentException Si la position est hors de la grille
     */
    public void tick(Position position, Tick tick) throws AlreadyTickedField, IllegalArgumentException {
        if(!grid.containsKey(position)) {
            throw new IllegalArgumentException("Hors grille");
        }

        if (!grid.get(position).tick(tick)) {
            throw new AlreadyTickedField(position);
        }
    }


    public boolean isFull() {
        for (Field field: grid.values()) {
            if (field.isTicked() == false) {
                return false;
            }
        }
        return true;
    }

    public List<List<Field>> lines() {
        List<List<Field>> lines = new ArrayList<>();
        for (int x = 0; x < taille; ++x) {
            lines.add(line(x));
        }

        return lines;
    }

    private List<Field> line(int x) {
        List<Field> line = new ArrayList<>();
        for(int y = 0; y < taille; ++y) {
            line.add(grid.get(new Position(x, y)));
        }

        return line;
    }

    public List<List<Field>> columns() {
        List<List<Field>> columns = new ArrayList<>();
        for (int y = 0; y < taille; ++y) {
            columns.add(column(y));
        }

        return columns;    }

    private List<Field> column(int y) {
        List<Field> column = new ArrayList<>();
        for(int x = 0; x < taille; ++x) {
            column.add(grid.get(new Position(x, y)));
        }
        return column;
    }

    public List<List<Field>> diagonals() {
        List<List<Field>> diagonals = new ArrayList<>();
        diagonals.add(diagonal());
        diagonals.add(reverseDiagonal());

        return diagonals;
    }

    private List<Field> diagonal() {
        List<Field> diagonal = new ArrayList<>();

        for (int i = 0; i < taille; ++i) {
            diagonal.add(grid.get(new Position(i, i)));
        }

        return diagonal;
    }

    private List<Field> reverseDiagonal() {
        List<Field> diagonal = new ArrayList<>();

        for (int i = 0; i < taille; ++i) {
            diagonal.add(grid.get(new Position(i, taille - i - 1)));
        }

        return diagonal;
    }
}
