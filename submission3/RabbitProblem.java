package submission3;

public class RabbitProblem {

    public static void main(String[] args) {

        int first = 1;
        int second = 1;
        int next;

        System.out.println(first);
        System.out.println(second);

        for (int i = 3; i <= 8; i++) {

            next = first + second;

            System.out.println(next);

            first = second;
            second = next;
        }
    }
}

