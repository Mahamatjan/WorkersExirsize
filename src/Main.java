import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Maha",16,"Programmer");
        Worker worker2 = new Worker("Nuris",11,"Programmer");
        Worker worker3 = new Worker("Jazgul",20,"Programmer");
        Worker worker4 = new Worker("Syimyk",14,"Programmer");
        Worker worker5 = new Worker("Kerez",30,"Programmer");
        LinkedList<Worker> list = new LinkedList<>();
        list.add(worker1);
        list.add(worker2);
        list.add(worker3);
        list.add(worker4);
        list.add(worker5);
        list.sort(Worker::compareTo);
        System.out.println(list);
    }
}