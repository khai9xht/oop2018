package week1;

public class StudentManagement {
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

        Student[] Array = new Student[100];
        Array[0] = new Student("Nguyen Viet Hoang", "INT 2204 4",
                "khaihoang9x@gmail.com", 17020771);
        Array[1] = new Student("Vu Viet Hoang", "INT 2204 11",
                "vuviethoang@gmail.com", 17020712);
        Array[2] = new Student("Nguyen Phuong Hieu","INT 2204 1",
                "hieuadh@gmail.com",17020642);
        Array[3] = new Student("Nguyen Phuong Huy","INT 2204 11",
                "hieuadh@gmail.com",17020622);
        Array[4] = new Student("Nguyen huy Ha","INT 2204 4",
                "hieuadh@gmail.com",17020692);
        Array[5] = new Student("Nguyen thi Hoa","INT 2204 11",
                "hieuadh@gmail.com",17020672);
        removeStudent(Array, 6, 17020712);
        studentsByGroup(Array, 5);

    }

    public static boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup()).equals(s2.getGroup());
    }

    public static void studentsByGroup(Student[] array, int n) {
        boolean[] checkGroup = new boolean[n]; // kiểm tra lượt check
        for(int i=0;i<n;i++) checkGroup[i]=false; //tất cả chưa check

        for(int i=0;i<n;i++){
            if(!checkGroup[i]){
                System.out.println("Group " + (array[i].getGroup()) + ": ");
                checkGroup[i] = true;
                for(int j=i;j<n;j++) {
                    if ((array[j].getGroup()).equals(array[i].getGroup())) {
                        System.out.println('\t' + array[j].getName());
                        checkGroup[j] = true;
                    }
                }
            }
        }
    }

    public static void removeStudent(Student[] array,int n, int id) {
        for(int i=0;i<n;i++){
            if(id==array[i].getId()) {
                for(int j=i;j<n-1;j++) {
                    array[j].setAll(array[j+1]);
                }
                break;
            }
        }
    }


}

