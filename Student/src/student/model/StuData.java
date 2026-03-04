
package student.model;

public class StuData {
    private int id;
    private String name;
    private String course;
    private String mobile;
    private String bloodGroup;

    public StuData() {
    }

    public StuData(String name, String course, String mobile, String bloodGroup) {
        this.name = name;
        this.course = course;
        this.mobile = mobile;
        this.bloodGroup = bloodGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    
    
}
