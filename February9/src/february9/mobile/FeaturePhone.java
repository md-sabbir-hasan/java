
package february9.mobile;

public class FeaturePhone extends Mobile{
    private String radio, java, operamini;

    public FeaturePhone() {
    }

    public FeaturePhone(String radio, String java, String operamini) {
        this.radio = radio;
        this.java = java;
        this.operamini = operamini;
    }

    public FeaturePhone(String radio, String java, String operamini, String call, String message, String games, String camera, String gallary) {
        super(call, message, games, camera, gallary);
        this.radio = radio;
        this.java = java;
        this.operamini = operamini;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getJava() {
        return java;
    }

    public void setJava(String java) {
        this.java = java;
    }

    public String getOperamini() {
        return operamini;
    }

    public void setOperamini(String operamini) {
        this.operamini = operamini;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FeaturePhone{");
        sb.append("radio=").append(radio);
        sb.append(", java=").append(java);
        sb.append(", operamini=").append(operamini);
        sb.append('}');
        return sb.toString();
    }
    
    
}
