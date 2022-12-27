package module27;

import java.io.FileWriter;

public class WriterDemo {
    public static void main(String[] args) throws Exception {
        //source to write
        String source = "\nMy name is Rita";
        //string to chars
        char buffer[] = new char[source.length()];
        //arrange chars
        source.getChars(0,source.length(),buffer,0);
        //writer
        FileWriter fileWriter = new FileWriter("./src/module27/hello.txt",true);
        for (char c : buffer) {
            fileWriter.write(c);
        }
        fileWriter.close();
    }
}
