package application;

public class MyObserver {

	
	public MyObserver(final SampleController controller) {
		
		controller.setObserver((product) -> handleProductAdded(product));
		
	}
	
	public Void handleProductAdded(final Product product) {
		System.out.println(product.getName());
		return null;
	}
	
}
