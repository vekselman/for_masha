import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Worker jerry = new Worker("Jerry");
        Worker spike = new Worker("Spike");
        Worker tom = new Worker("Tom");

        Map<Integer, Worker> workers = new HashMap<Integer, Worker>();
        workers.put(jerry.getId(), jerry);
        workers.put(spike.getId(), spike);
        workers.put(tom.getId(), spike);

        int id;
        int type;
        Worker worker;
        do{
            System.out.print("Worker id number: ");
            id = in.nextInt();
            System.out.print("Datatype number: ");
            type = in.nextInt();
            if ((1 > id) || ( id > workers.size())){
                System.err.println("Invalid worker ID");
                System.exit(1);
            }
            worker = workers.get(id);
            worker.printFunction(type);
        }while(true);
    }
}
