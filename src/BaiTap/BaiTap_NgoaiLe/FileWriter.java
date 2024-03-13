package BaiTap.BaiTap_NgoaiLe;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class FileWriter {
    //static: hàm ăn theo lớp
    public static void write(String fileName, String s){
        File file = new File(fileName);//surround xử lý ngay tại chỗ
        PrintWriter out = null;
        try {
            out = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("File ko tim thay");
        }
        out.println(s);
        out.close();
    }
    public static void read(String fileName){
        try {
            File file = new File(fileName);
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("File ko tim thay");
        }
    }

    public static void main(String[] args) {
        FileWriter.write("hello.txt", "Ban Test");
        FileWriter.read("abc.txt");
    }
}