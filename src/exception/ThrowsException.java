package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(fileName); //FileNotFoundException ¹ß»ý
        Class c = Class.forName(className);  //ClassNotFoundException ¹ß»ý
        return c;
    }

    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();
        test.loadClass("a.txt", "java.lang.String");
    }
}