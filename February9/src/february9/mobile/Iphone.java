
package february9.mobile;

public class Iphone extends Mobile{
    private String facetime, safari, imessage;

    public Iphone() {
    }

    public Iphone(String facetime, String safari, String imessage) {
        this.facetime = facetime;
        this.safari = safari;
        this.imessage = imessage;
    }

    public Iphone(String facetime, String safari, String imessage, String call, String message, String games, String camera, String gallary) {
        super(call, message, games, camera, gallary);
        this.facetime = facetime;
        this.safari = safari;
        this.imessage = imessage;
    }

    public String getFacetime() {
        return facetime;
    }

    public void setFacetime(String facetime) {
        this.facetime = facetime;
    }

    public String getSafari() {
        return safari;
    }

    public void setSafari(String safari) {
        this.safari = safari;
    }

    public String getImessage() {
        return imessage;
    }

    public void setImessage(String imessage) {
        this.imessage = imessage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Iphone{");
        sb.append("facetime=").append(facetime);
        sb.append(", safari=").append(safari);
        sb.append(", imessage=").append(imessage);
        sb.append('}');
        return sb.toString();
    }
    
    
}
