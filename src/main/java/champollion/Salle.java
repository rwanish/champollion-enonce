package champollion;

import java.util.List;
import java.util.ArrayList;


public class Salle {
    private final String intitule; // Attribut en lecture seule
    private final int capacite; // Attribut en lecture seule
    private final List<Intervention> reservations = new ArrayList<>(); // Liste des interventions prévues dans cette salle

    // Constructeur
    public Salle(String intitule, int capacite) {
        this.intitule = intitule;
        this.capacite = capacite;
    }

    // Accesseurs
    public String getIntitule() {
        return intitule;
    }

    public int getCapacite() {
        return capacite;
    }

    public List<Intervention> getReservations() {
        return reservations;
    }

    // Ajouter une intervention (réservation)
    public void ajouterReservation(Intervention intervention) {
        if (intervention == null) {
            throw new IllegalArgumentException("L'intervention ne peut pas être null.");
        }
        reservations.add(intervention);
    }
}
