
package february23;

public class Student {
    private int id;
    private String Name;
    private String mail;

    public Student() {
    }

    public Student(int id, String Name, String mail) {
        this.id = id;
        this.Name = Name;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", Name=" + Name + ", mail=" + mail + '}';
    }
    
     

}
