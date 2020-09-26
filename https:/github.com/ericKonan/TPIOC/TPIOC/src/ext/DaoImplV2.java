package ext;

import dao.IDao;

public class DaoImplV2 implements IDao{


	@Override
	public double getData() {
		/**
		 * Version web service
		 */
		System.out.println("Version web service");
		double data = 12;
		return data;
	}

}
