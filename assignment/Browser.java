package week1.assignment;

public class Browser {

	public static void main(String[] args) {

		Browser brws = new Browser();
		brws.launchBrowser("Chrome");
		brws.loadUrl();

	}

	public void launchBrowser(String browserName)
	{
		System.out.println(browserName + " Browser launched successfully");
		
		return;
	}
	
	public void loadUrl()
	{
		
		System.out.println("Application url loaded successfully");
	}
}
