package org;

public class Main {
    public static void main(String args[]){
        Learning learning = Learning.JAVA8;

        switch (learning){
            case COREJAVA -> {
                System.out.println("Learn Core java");
            }
            case GENERICS -> {
                System.out.println("learn generics");
            }
            case JSPANDSERVELETS -> {
                System.out.println("learn jsp and servelts");
            }
            case MULTITHREADING -> {
                System.out.println("learn ,ulti threading");
            }
            case COLLECTIONS -> {
                System.out.println("learm collecetions");
            }
            case JAVA8 -> {
                System.out.println("its java 8");
            }
            default -> {
                System.out.println("learn java");
            }
        }
    }
}
