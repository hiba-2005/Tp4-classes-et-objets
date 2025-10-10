package com.example.tp;

public class Étudiant {
	private static int compteur = 0;
	private final int id;
	private String nom;
	private String prenom;
	private Filiere filiere;

	public Étudiant(String nom, String prenom) {
		this.id = ++compteur;
		this.nom = nom;
		this.prenom = prenom;
	}

	public void setFiliere(Filiere f) {
		this.filiere = f;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	@Override
	public String toString() {
		String fil = (filiere != null) ? filiere.getNom() : "Aucune";
		return "Étudiant[id=" + id + ", nom=" + nom + ", prénom=" + prenom + ", filière=" + fil + "]";
	}
}