package week1;
public class StudentManagement {
    private static int n=6;
    private static Student[] Array = new Student[n];

    public static void main(String[] args) {
        Student K62_uet = new Student("Nguyen Viet Hoang", "INT 2204 4",
                "khaihoang9x@gmail.com", 17020771);
        //  Student K62_uet = new Student();   //contructor không có tham so
        Student a = new Student("Vu Viet Hoang", "INT 2204 4",
                "vuviethoang@gmail.com", 17020712);
        Student b = new Student("Nguyen Phuong Hieu","INT2204 11",
                "hieuadh@gmail.com",17020672);

        System.out.println(K62_uet.getInfo());

        if (sameGroup(a,K62_uet)) System.out.println(a.getName()+" and " + K62_uet.getName() + " are same class");
        else System.out.println(a.getName() + " and " + K62_uet.getName() + " are different class");
        if (sameGroup(b,K62_uet)) System.out.println(b.getName()+" and " + K62_uet.getName() + " are same class");
        else System.out.println(b.getName() + " and " + K62_uet.getName() + " are different class");
        Array[0] = new  Student("Vu Viet Hoang", "INT 2204 4",
                "vuviethoang@gmail.com", 17020712);
        Array[1] = new Student("Nguyen Phuong Hieu","INT2204 1",
                "hieuadh@gmail.com",17020672);
        Array[2] = new Student("Nguyen Huy","INT2204 11",
                "hieuadh@gmail.com",17020971);
        Array[3] = new Student("Nguyen Phuong Hoa","INT2204 8",
                "hieuadh@gmail.com",17020672);
        Array[4] = new Student("Nguyen thi ha","INT2204 1",
                "hieuadh@gmail.com",17020712);
        Array[5] = new Student("Nguyen thi hang","INT2204 11",
                "hieuadh@gmail.com",17020712);
        removeStudent(17020971);
        studentsByGroup();
        
    }



    public static boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup()).equals(s2.getGroup());
    }

    public static void studentsByGroup() {
        boolean[] checkGroup = new boolean[n]; // kiểm tra lượt check
        for(int i=0;i<n;i++) checkGroup[i]=false; //tất cả chưa check

        for(int i=0;i<n;i++){
            if(!checkGroup[i]){
                System.out.println("Group " + (Array[i].getGroup()) + ": ");
                checkGroup[i] = true;
                for(int j=i;j<n;j++) {
                    if ((Array[j].getGroup()).equals(Array[i].getGroup())) {
                        System.out.println('\t' + Array[j].getName());
                        checkGroup[j] = true;
                    }
                }
            }
        }
    }

    public static void removeStudent( int id) {
        for(int i=0;i<n;i++){
            if(id==Array[i].getId()) {
                for(int j=i;j<n-1;j++) {
                    Array[j].setAll(Array[j + 1]);
                }
                Array[n-1] = null;
                n--;
                break;
            }
        }
    }


}

