package module27;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("./src/module27/hello.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s;
        while (
                (s=bufferedReader.readLine())!=null
        ){
            System.out.println(s);
        }
        fileReader.close();

    }
}
