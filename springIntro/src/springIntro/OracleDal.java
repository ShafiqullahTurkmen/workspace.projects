package springIntro;

public class OracleDal implements ICustomerDal{
	private String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}



	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}



	public void add() {
		System.out.println("Connection String : " + connectionString);
		System.out.println("Oracle veritabanına eklendi");
	}
}
