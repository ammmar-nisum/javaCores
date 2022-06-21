public class Main {
    public static void main(String args[]){
        String[] var ={"ammar","hashir","mujji","nisum"};
        System.out.println(var[0]);
        Main main = new Main();
        main.display(var);
        System.out.println("**********************");
        System.out.println(var[0]);

    }

    void display(String[] var){
        var[0]="salim";
        for(String name: var){
            System.out.println(name);
        }
    }
}
