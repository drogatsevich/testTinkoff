package browser;

public class BrowserFactory {

	public IBrowser getBrowser(BrowserType browserType) {
		return new Browsers(browserType);
	}
}
