package week9;

import java.io.*;

public class Utils {
    public static String readContentFromFile(String path){
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(path);
            BufferedReader br = new BufferedReader(fileReader);
            String str = br.readLine();
            br.close();
            fileReader.close();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void writeContentToFile1(String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        bw.write("kafcbnakmdcnbkan");
        bw.close();
        fileWriter.close();
    }

    public static void writeContentToFile2(String path) throws IOException {
        File file = new File(path);
        FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("\tviết tiếp thành công !");
        bw.close();
        fw.close();
    }

    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath+"\\"+fileName);
        if(file.exists()) return file;
        return null;
    }

    public static void main(String[] args) {
        String x = Utils.readContentFromFile("doc.txt");
        System.out.println(x);

        try {
            Utils.writeContentToFile1("doc.txt");
            x = Utils.readContentFromFile("doc.txt");
            System.out.println(x);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            Utils.writeContentToFile2("doc.txt");
            x = Utils.readContentFromFile("doc.txt");
            System.out.println(x);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
