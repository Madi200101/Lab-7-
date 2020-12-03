package Madi.kz;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws FileNotFoundException{
        String pathname = "E:/A.txt";
        Scanner scanner =new Scanner(new File(pathname));
        ArrayList<String> arrayList = new ArrayList<>();
        while (scanner.hasNextLine()){
            arrayList.add(scanner.nextLine());
        } scanner.close();
        Collections.sort(arrayList);

        for(String anArrayList : arrayList){
            System.out.println(anArrayList);
        }
    }
}
