package mentor.mentor4.cards;

public enum Rank {
    SIX("шестёрка"),
    SEVEN("семёрка"),
    EIGHT("восьмёрка"),
    NINE("девятка"),
    TEN("десятка"),
    JACK("валет"),
    QUEEN("королева"),
    KING("король"),
    ACE("туз");

    private String translation;


    Rank(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "translation " + translation;
    }
}
