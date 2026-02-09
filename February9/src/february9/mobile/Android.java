
package february9.mobile;

public class Android extends Mobile{
    private String OS, browser, touch, appStor;

    public Android() {
    }

    public Android(String OS, String browser, String touch, String appStor) {
        this.OS = OS;
        this.browser = browser;
        this.touch = touch;
        this.appStor = appStor;
    }

    public Android(String OS, String browser, String touch, String appStor, String call, String message, String games, String camera, String gallary) {
        super(call, message, games, camera, gallary);
        this.OS = OS;
        this.browser = browser;
        this.touch = touch;
        this.appStor = appStor;
    }

   

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getTouch() {
        return touch;
    }

    public void setTouch(String touch) {
        this.touch = touch;
    }

    public String getAppStor() {
        return appStor;
    }

    public void setAppStor(String appStor) {
        this.appStor = appStor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Android{");
        sb.append("OS=").append(OS);
        sb.append(", browser=").append(browser);
        sb.append(", touch=").append(touch);
        sb.append(", appStor=").append(appStor);
        sb.append('}');
        return sb.toString();
    }

  
    
    
  
    
}
