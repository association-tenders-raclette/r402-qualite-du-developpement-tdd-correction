package fr.univ_amu.but.r4_02.exception;

import fr.univ_amu.but.r4_02.Position;

public class AlreadyTickedField extends Exception {

    public AlreadyTickedField(Position position) {
        super("Field " + position + " already ticked");
    }
}
