package fr.univamu.iut.exo2;

public class Radio implements Connectable {
    public String nom;
    @Override
    public String setNom(String nom)
    {
        return this.nom = nom;
    }
    @Override
    public String getNom()
    {
        return nom;
    }

    @Override
    public void equiper(String gadget)
    {
        System.out.println(gadget + " équipé sur la Radio");
    }
}
