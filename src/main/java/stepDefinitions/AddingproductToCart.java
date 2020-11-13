package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ShoppingApp.Genericlib.PropertyFile;
import com.ShoppingApp.Genericlib.Utilies;
import com.ShoppingApp.pages.AddProductCart;
import com.ShoppingApp.pages.Login;
import com.ShoppingApp.pages.Product;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddingproductToCart {
	public WebDriver driver;
	public Product p;
	public AddProductCart c;

	@Given("^Open the browser enter the valid url$")
	public void open_the_browser_enter_the_valid_url() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(PropertyFile.getData("url"));

	}

	@When("^Seraching for the product$")
	public void seraching_for_the_product() throws Throwable {
		Login l = new Login(driver);
		p = l.serachingProduct(PropertyFile.getData("product"));
	}

	@When("^sort it according to lowest price$")
	public void sort_it_according_to_lowest_price() throws Throwable {
		Utilies.dropdown(p.getSortdd(), PropertyFile.getData("sort"));
	}

	@Then("^Select the product$")
	public void select_the_product() throws Throwable {
		c = p.selectDress();
	}

	@Then("^Select the quatity and color and size$")
	public void select_the_quatity_and_color_and_size() throws Throwable {
		c.getPlusBtn();
		Utilies.dropdown(c.getSizedd(), PropertyFile.getData("size"));
		c.addingCart();
	}

	@Then("^product should succesfully added to cart$")
	public void product_should_succesfully_added_to_cart() throws Throwable {
		System.out.println("successfully added");
	}

}
