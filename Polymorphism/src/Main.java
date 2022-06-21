public class Main {
    public static void main(String args[]){


        Phone nokia = new Main().phone(1);

        Phone samsung = new Main().phone(2);

        System.out.println(nokia.getModel());
        System.out.println(samsung.getModel());
        nokia.feature();
        samsung.feature();

    }

    public Phone phone(int dailyDriver){
        switch (dailyDriver){
            case 1: return new Nokia3310("nokia22");
            case 2 : return new SamsungNote("note4");
        }
        return null;
    }
}

