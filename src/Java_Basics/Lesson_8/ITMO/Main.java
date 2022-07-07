package Java_Basics.Lesson_8.ITMO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getLogger("Logger");
    //Slf4j <- логирование
    public static void main(String[] args) {
        try {
            methodWithException();
        } catch (NumberFormatException e) {
            logger.warning(e.getMessage());
            String methodName = e.getStackTrace()[0].getMethodName();
            throw new MyUncheckedException("some problem!");
//            System.err.println(e.getMessage());
        } catch (IOException e) {
//            e.printStackTrace();
            System.err.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }

//        try {
//            unckeckedExceptionMethod();
//        } catch (MyUncheckedException e) {
//            e.printStackTrace();
//        }
    }

    public static void methodWithException() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        logger.info(String.valueOf(i));
//        logger.log(Level.INFO, String.valueOf(i));
//        System.out.println(i);
        //      String s = reader.readLine();
    }

    public static void unckeckedExceptionMethod() throws MyUncheckedException {
        throw new MyUncheckedException("MyUncheckedException");
    }

    public static void checkedExceptionMethod(){
        try {
            throw new MyCheckedException("MyCheckedException");
        } catch (MyCheckedException e) {
            e.printStackTrace();
        }
    }
}
