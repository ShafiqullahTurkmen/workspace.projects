package intro;

public class Main {
	public static void main(String[] args) {
		//camelCase
		//Don't repeat yourself
		
		String internetSubeButonu = "internet Şubeye gir";
		double dolarDun = 8.15;
		double dolarBugun = 8.15;
		int vade = 36;
		boolean dustumu = false;
		
		
		System.out.println(internetSubeButonu);
		
		if (dolarBugun < dolarDun) {
			System.out.println("Dolar düştü resmi");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Doalr yukseldı resmı");
		} else {
			System.out.println("Dolar eşittir resmi");
		}
		
		
		String[] krediler = {"Hızlı kredi", "Mutlu emekli kredi", "Konut kredisi", "Msb kredi", "Meb kredi"};
		
		for (String kredi : krediler) {
			System.out.println(kredi);
			
			
			
		}
		
	}

}
