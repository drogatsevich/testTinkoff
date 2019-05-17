package browser;

public interface IBrowser {

	void createWebDriver(BrowserType browserType);

	public void openURL(String url);
	public void quit();
}
