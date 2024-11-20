package champollion;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
public class Intervention {
    // Accesseurs
    private final Date debut; // Date de début de l'intervention
    private final int duree; // Durée en heures

    @Setter
    private boolean annule; // Intervention annulée ou non
    private final int heureDebut; // Heure de début
    private final TypeIntervention type; // Type d'intervention (CM, TD, TP)
    private final UE ue; // L'UE concernée
    private final Enseignant enseignant; // L'enseignant affecté à l'intervention

    @Setter
    private Salle salle; // La salle dans laquelle se déroule l'intervention

    // Constructeur
    public Intervention(Date debut, int duree, int heureDebut, TypeIntervention type, UE ue, Enseignant enseignant) {
        if (debut == null || ue == null || enseignant == null || type == null) {
            throw new IllegalArgumentException("Aucun paramètre ne peut être null.");
        }
        if (duree <= 0) {
            throw new IllegalArgumentException("La durée doit être positive.");
        }

        this.debut = debut;
        this.duree = duree;
        this.heureDebut = heureDebut;
        this.type = type;
        this.ue = ue;
        this.enseignant = enseignant;
        this.annule = false; // Par défaut, l'intervention n'est pas annulée
    }

}
