package fr.univamu.iut.exo1;

public class Cafetière implements Connectable {
    public String nom;

    public String setNom(String nom)
    {
        return this.nom = nom;
    }

    public String getNom()
    {
        return nom;
    }

    @Override
    public void equiper(String gadget)
    {
        System.out.println(gadget + " équipé");
    }
}
