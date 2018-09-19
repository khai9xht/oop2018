package week1;
public class StudentManagement {
    private Student[] Array = new Student[100];
    private int num;
    public void setNum(int n){
        num = n;
    }
    public static void main(String[] args) {
        Student K62_uet = new Student("Nguyen Viet Hoang", "INT 2204 4",
                "khaihoang9x@gmail.com", 17020771);
        //  Student K62_uet = new Student();   //contructor không có tham so
        Student a = new Student("Vu Viet Hoang", "INT 2204 4",
                "vuviethoang@gmail.com", 17020712);
        Student b = new Student("Nguyen Phuong Hieu","INT2204 11",
                "hieuadh@gmail.com",17020672);

        System.out.println(K62_uet.getInfo());
        StudentManagement SM = new StudentManagement();
        SM.num = 6;
        if (SM.sameGroup(a,K62_uet)) System.out.println(a.getName()+" and " + K62_uet.getName() + " are same class");
        else System.out.println(a.getName() + " and " + K62_uet.getName() + " are different class");
        if (SM.sameGroup(b,K62_uet)) System.out.println(b.getName()+" and " + K62_uet.getName() + " are same class");
        else System.out.println(b.getName() + " and " + K62_uet.getName() + " are different class");

        SM.Array[0] = new Student("Nguyen Viet Hoang", "INT 2204 4",
                "khaihoang9x@gmail.com", 17020771);
        SM.Array[1] = new Student("Vu Viet Hoang", "INT 2204 11",
                "vuviethoang@gmail.com", 17020712);
        SM.Array[2] = new Student("Nguyen Phuong Hieu","INT 2204 1",
                "hieuadh@gmail.com",17020642);
        SM.Array[3] = new Student("Nguyen Phuong Huy","INT 2204 11",
                "hieuadh@gmail.com",17020622);
        SM.Array[4] = new Student("Nguyen huy Ha","INT 2204 4",
                "hieuadh@gmail.com",17020692);
        SM.Array[5] = new Student("Nguyen thi Hoa","INT 2204 11",
                "hieuadh@gmail.com",17020672);
        SM.studentsByGroup();
        SM.removeStudent(17020642);
        SM.studentsByGroup();

    }

    public boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup()).equals(s2.getGroup());
    }

    public void studentsByGroup() {
        int n = this.num;
        boolean[] checkGroup = new boolean[n]; // kiểm tra lượt check
        for(int i=0;i<n;i++) checkGroup[i]=false; //tất cả chưa check

        for(int i=0;i<n;i++){
            if(!checkGroup[i]){
                System.out.println("Group " + (this.Array[i].getGroup()) + ": ");
                checkGroup[i] = true;
                for(int j=i;j<n;j++) {
                    if ((this.Array[j].getGroup()).equals(this.Array[i].getGroup())) {
                        System.out.println('\t' + this.Array[j].getName());
                        checkGroup[j] = true;
                    }
                }
            }
        }
    }

    public void removeStudent(int id) {
        int n = this.num;
        for(int i=0;i<n;i++){
            if(id==this.Array[i].getId()) {
                for(int j=i;j<n-1;j++) {
                    this.Array[j].setAll(this.Array[j+1]);
                }
                this.Array[n-1] = null;
                this.setNum(n-1);
                break;
            }
        }
    }


}


