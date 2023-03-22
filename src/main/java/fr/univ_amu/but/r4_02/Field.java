package fr.univ_amu.but.r4_02;

public class Field {
    private Tick tick;

    public Field() {
        this.tick = null;
    }


    /**
     * @param tick Le tick à mettre sur le champ
     * @return true Si le champ n'était pas déjà marqué et que le tick n'est pas null, false sinon
     */
    public boolean tick(Tick tick) {
        return false;
    }

    public boolean isTicked() {
        return false;
    }

    public Tick getTick() {
        return null;
    }
}
