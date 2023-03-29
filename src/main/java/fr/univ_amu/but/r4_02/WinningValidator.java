package fr.univ_amu.but.r4_02;

import fr.univ_amu.but.r4_02.exception.TooManyTickOnConsecutiveFields;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WinningValidator {

    public WinningValidator() {
    }

    /**
     *
     * @param fields Liste des champs consécutifs à vérifier
     * @return Le Tick gagnant s'il y en a un et un seul
     * @throws TooManyTickOnConsecutiveFields S'il y a plus d'un Tick sur les champs consécutifs
     */
    public Tick validate(List<Field> fields) throws TooManyTickOnConsecutiveFields {
        Set<Tick> ticks = new HashSet<>();
        for (Field field :
                fields) {
            ticks.add(field.getTick());
        }

        if (ticks.size() > 1) {
            throw new TooManyTickOnConsecutiveFields();
        }

        return ticks.iterator().next();
    }
}
