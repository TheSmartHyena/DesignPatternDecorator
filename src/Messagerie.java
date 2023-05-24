// ConcreteComponent
public class Messagerie implements IMessagerie {
    private String message;
    private int destinataire;
    private int expediteur;

    public Messagerie(String message, int destinataire, int expediteur) {
        this.message = message;
        this.destinataire = destinataire;
        this.expediteur = expediteur;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public int getDestinataire() {
        return destinataire;
    }

    @Override
    public int getExpediteur() {
        return expediteur;
    }
}