package week1;
public class Student {
    private String name,email,group;
    private int id;
    //contructor có tham số
    public Student(String Name, String Group, String Email, int Id){
        name = Name;
        group = Group;
        email = Email;
        id = Id;
    }
    //contructor khong có tham số
    public Student() {
        name = "Student";
        group = "INT 2204 4";
        email = "khaihoang9x@gmail.com";
        id = 0;
    }
    //contructor sao chép
    public Student(Student s){
        this.name = s.name;
        this.group = s.group;
        this.email = s.email;
        this.id = s.id;
    }
    public String getName(){
        return  name;
    }
    public String getGroup(){
        return group;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String getInfo() {
        return ("Your name: " + name + '\n' + "Your group: " + group
                + '\n' + "Your id: " + id + '\n' + "Your email: " + email);
    }
    public void setAll(Student s1) {
        this.name = s1.name;
        this.id = s1.id;
        this.email = s1.email;
        this.group = s1.group;
    }
}
