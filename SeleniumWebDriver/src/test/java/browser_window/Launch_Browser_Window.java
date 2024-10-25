package browser_window;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//script to launch browser window using user input
public class Launch_Browser_Window {

	static WebDriver driver;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter Browser Name: ");
		String browserName = s.next();

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();

		}

	}

}
