package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import javafx.fxml.FXML;
import javafx.util.Callback;

public class SampleController {
	
	private MyObserver myObserver;
	private Callback<Product,Void> observer;
	
	public SampleController() {
	
		myObserver = new MyObserver(this);
		
	}
	
	
	public void setObserver(final Callback<Product,Void> observer) {
		this.observer = observer;
	}
	
	
	@FXML
	private void handleButton() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");
		//DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		final String name = LocalDateTime.now().format(formatter);
		final Product product = new Product(name);
		observer.call(product);
	}
}
