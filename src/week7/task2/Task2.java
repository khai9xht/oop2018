package week7.task2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void cutString(String s) throws NullPointerException{
        if(s == null) throw new NullPointerException("no value in this string");
        else{
            s.substring(0,s.length()/2);
        }
    }
    public static void find_value(int s[]) throws ArrayIndexOutOfBoundsException{
        for (int i=0;i<1000;i+=10){
            if(s[i] == 23) System.out.println("find successfully");
        }
    }
    public static int division(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public static void openFile() throws FileNotFoundException {
        FileReader file = new FileReader("doc.txt");
        Scanner sc = new Scanner(file);
        System.out.println(sc.next());
    }
    public static void writeFile() throws IOException{
        FileWriter file = new FileWriter("doc.txt");
        file.write('a');
        file.close();
    }
    public static void cout(int x) throws ClassCastException{
        System.out.print((char) x);
    }

    public static void main(String[] args) {
        String s = null;
        cutString(s);
        int x[] = {3,45,34,2,3,2,34,2345,23,52,34,234,52};
        try {
            find_value(x);
        } catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.print("hihi");
        }
        division(5,0);
        try {
            openFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        cout(10000);
    }
}
