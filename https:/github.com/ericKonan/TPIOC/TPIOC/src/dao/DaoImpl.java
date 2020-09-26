package dao;

public class DaoImpl implements IDao {

	@Override
	public double getData() {
		/*
		 * Je me connecte a la bd
		 */
		
		double data = 98;
		return data;
	}
	
	public void init() {		
		System.out.println("Instanciation de DAO Implementation");
	}

}
