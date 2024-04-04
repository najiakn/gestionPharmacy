package dao;

import java.util.List;

import metier.entities.Produits;
public interface ProduitDao {
	public Produits save(Produits p);
	public List<Produits> produitsParMc(String mc);
	public Produits getProduit(int id);
	public Produits getProduits(int id);
	public Produits update(Produits P);
    public void deleteProduit(int id);
    

}
