import java.io.*;
import java.util.Scanner;
public class prog71 {
    public static void main(String[] args) {
        try{
            File f=new File("E:\\TEXT.txt");
            FileWriter w=new FileWriter(f);
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter some shit");
            String data=scanner.nextLine();
            w.write(data);
            w.close();
            Scanner reader=new Scanner(f);
            String data1="";
            while (reader.hasNextLine()){
                data1=reader.nextLine();
            }
            System.out.println(data1);
            scanner.close();
            reader.close();
    }
    catch (Exception e){
        e.printStackTrace();
    }
}
}