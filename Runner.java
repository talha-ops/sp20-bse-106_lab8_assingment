import computer.Computer;
public class Runner {
    public static void main(String[] args) {
        Computer c1 = new Computer(22,60,64,50);
        Laptop l1 = new Laptop(10,7,9,5);
        c1.display();
        System.out.println();
        l1.display();
    }    
}

