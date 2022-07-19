import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Quiz1Question9 {
    public static void main(String[] args) {
        Queue<Person> queue = new PriorityQueue(4, new PersonComparator());
        queue.add(new Person(90));
        queue.add(new Person(85));
        queue.add(new Person(95));
//        queue.add(null);

        System.out.println(queue.poll().getMathScore());
        System.out.println(queue.poll().getMathScore());
        System.out.println(queue.poll().getMathScore());
    }
}

class Person {
    private int mathScore;

    public Person(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }
}

class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p2.getMathScore(), p1.getMathScore());
    }
}
