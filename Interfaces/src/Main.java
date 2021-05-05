
public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new DataBaseLogger(), new EmailLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer engin = new Customer(1,"Engin", "Demiroğ");
		
		
		customerManager.add(engin);
	}

}
