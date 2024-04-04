package dao;

import java.sql.Connection;
import java.util.List;

import metier.entities.Produits;

public class produitDaoImpl implements ProduitDao{

	@Override
	public Produits save(Produits p) {
	Connection connection=SingletonConnectio.getConnection();
	try {}
	PrepareStatement pd =connection.prepareStatement("insert into produits (nom,quantité,prix,description)values(?,?,?,?)");
		return null;
	}

	@Override
	public List<Produits> produitsParMc(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produits getProduit(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produits getProduits(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produits update(Produits P) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduit(int id) {
		// TODO Auto-generated method stub
		
	}
	

}
