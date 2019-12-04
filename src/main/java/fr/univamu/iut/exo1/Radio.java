package fr.univamu.iut.exo1;

public class Radio {
    public String nom;

    public String setNom(String nom)
    {
        return this.nom = nom;
    }

    public String getNom()
    {
        return nom;
    }

    public void equiper(String gadget)
    {
        System.out.println(gadget + " équipé");
    }
}
