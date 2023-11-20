package org.example;

public class Voiture {
    private double vitesse;
    private Date miseEnService;
    private Date controleTechnique;

    private Couleur couleur;
    private Direction direction;
    private double quantiteCarburant;
    private int poid;
    private boolean estAllumee;

    public Voiture(){
        this.couleur=Couleur.BLEU;
        this.poid=11;
        this.quantiteCarburant = 0;
        this.vitesse = 0;
        this.direction = Direction.NORD;
        this.estAllumee=false;
    }
    public Voiture (Couleur couleur, int poids, double quantiteCarburant, double vitesse, Direction direction, Date miseEnService, Date controleTechnique){
        this.couleur = couleur;
        this.poid=poids;
        this.quantiteCarburant=quantiteCarburant;
        this.vitesse=vitesse;
        this.direction=direction;
        this.miseEnService = miseEnService;
        this.controleTechnique = controleTechnique;
    }
    public Couleur getCouleur(){
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }
    // ICI action tourné pas demandé donc pas besoin de setter pour la direction.
    public Direction getDirection(){
        return direction;
    }

    public double getVitesse() {
        return vitesse;
    }

    public double getQuantiteCarburant() {
        return quantiteCarburant;
    }

    public boolean isEstAllumee() {
        return estAllumee;
    }

    public void setPoid(int poid) {
        this.poid = poid;
    }

    public int getPoid() {
        return poid;
    }

    public void setQuantiteCarburant(double quantiteCarburant) {
        this.quantiteCarburant = quantiteCarburant;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    protected void demarre(){
        this.estAllumee = true;
    }
    protected void arrete(){
        while ( this.getVitesse() > 0 )

        {

            this.freine();

        }
        this.estAllumee=false;
    }
    protected double freine(){
        if (this.estAllumee) {


            setVitesse(this.vitesse -= 10);
            if (vitesse <= 0)

            {

                vitesse = 0;

                System.out.println("La voiture a freiné et est maintenant arretée");

            }

        } else {

            System.out.println("La voiture est éteinte");

        }
        return this.vitesse;
    }
    private double freine (int vitesseAsoustraire){
        if (this.estAllumee) {


            setVitesse(this.vitesse -= vitesseAsoustraire);
            if (vitesse <= 0)

            {

                vitesse = 0;

                System.out.println("La voiture a freiné et est maintenant arretée");

            }

        } else {

            System.out.println("La voiture est éteinte");

        }
        return this.vitesse;
    }
    protected double accelere(int vitesseAajouter){
        if (this.estAllumee) {

            setVitesse(this.vitesse += vitesseAajouter);

        } else {

            System.out.println("La voiture est éteinte");

        }
        return this.vitesse;
    }
    protected double accelere(){
        if (this.estAllumee) {

            setVitesse(this.vitesse += 10);

        } else {

            System.out.println("La voiture est éteinte");

        }
        return this.vitesse;
    }

    public void evalueCT(int currentYear) {
        int yearsSinceService = currentYear - miseEnService.getYear();

        if (yearsSinceService <4){
            System.out.println("Le controle technique de la voiture est à jour. Car la voiture à moins de 4 ans.");
        } else{
            if (controleTechnique != null) {
                int yearsSinceLastControl = currentYear - controleTechnique.getYear();

                if (yearsSinceLastControl >= 2) {
                    System.out.println("Cette voiture doit passer un contrôle technique.");
                } else {
                    System.out.println("Le controle technique de la voiture est à jour.");
                }
            } else {
                System.out.println("La date du controle technique n'est pas disponible. Si il a jamais été fait faites le!");
            }
        }

    }

    @Override
    public String toString() {
        return "Vitesse: " + vitesse + ", Mise en service: " + miseEnService + ", Controle technique: " + controleTechnique;
    }
}
