import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class ToyShop {
    public static void main(String[] args) {
        ToyConstructor toy1 = new ToyConstructor("1", "2 конструктор", 20);
        ToyConstructor toy2 = new ToyConstructor("2", "2 робот", 20);
        ToyConstructor toy3 = new ToyConstructor("3", "6 кукла", 60);

        PriorityQueue<ToyConstructor> queue = new PriorityQueue<>();
        queue.add(toy1);
        queue.add(toy2);
        queue.add(toy3);

        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            for (int i = 0; i < 10; i++) {
                int random = (int) (Math.random() * 100);
                String result;
                if (random < 20) {
                    result = queue.poll().getId();
                } else if (random < 40) {
                    queue.poll();
                    result = queue.poll().getId();
                } else {
                    queue.poll();
                    queue.poll();
                    result = queue.poll().getId();
                }
                fileWriter.write(result + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

