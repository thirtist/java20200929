package chap06.textbook.exercises.p18;

public class ShopService {

	
	private static ShopService shopService = new ShopService();
	
	
	private ShopService() {
		
	}
	
	
	public static ShopService getInstance() {;
		return shopService;
	}
	
}
