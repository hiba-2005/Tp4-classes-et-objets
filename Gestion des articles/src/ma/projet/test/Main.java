package ma.projet.test;

import ma.projet.bean.Article;
import ma.projet.bean.Categorie;

public class Main {
	public static void main(String[] args) {

		Categorie c1 = new Categorie("Ordinateur Portable", "O PR");
		Categorie c2 = new Categorie("Ordinateur Poste", "O PO");

		Categorie[] categories = new Categorie[] { c1, c2 };

		Article a1 = new Article(14, "DELL INSPIRON", c1);
		Article a2 = new Article(4, "SONY VAIO", c1);
		Article a3 = new Article(74, "TERRA", c2);
		Article a4 = new Article(785, "HP Compaq", c2);

		Article[] articles = new Article[] { a1, a2, a3, a4 };

		for (int i = 0; i < categories.length; i++) {
			Categorie cat = categories[i];
			System.out.println(cat.getLibelle() + " :");
			for (int j = 0; j < articles.length; j++) {
				Article art = articles[j];
				if (art.getCategorie() != null && art.getCategorie().getId() == cat.getId()) {

					System.out.println("  - " + art.toString());
				}
			}
			System.out.println();
		}
	}
}
