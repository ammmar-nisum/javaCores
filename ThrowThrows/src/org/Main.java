package org;


import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLOutput;

class UserDefinedException extends Throwable{

}

public class Main {
    public static void main(String args[]) throws Exception {
        try{
            someMethod();
        }catch(FileNotFoundException e){
            System.out.println("from file not found catch block");
        }catch(RuntimeException e){
            System.out.println("Runtime exception");
        }catch(UserDefinedException e){
            System.out.println("user defined exception");

        }catch (Exception e){
            System.out.println("from exception block");
        }
    }
   public static void someMethod() throws Exception,RuntimeException,FileNotFoundException,UserDefinedException {
       int x =5;
       switch (x){
           case 0:
               throw new RuntimeException();
           case 1:
               throw new FileNotFoundException();
           case 2:
               throw new Exception();
           default:
               throw new UserDefinedException();
       }
    }
}
