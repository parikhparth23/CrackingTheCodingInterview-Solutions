package InterviewQuestions;

public class TowersOfHanoi {
    static void towersOfHanoi(int n, char fromPeg, char toPeg, char auxPeg) {
        if (n == 1) {
            System.out.println("Move disk from: " + fromPeg + " to: " + toPeg);
            return;
        }

        towersOfHanoi(n - 1, fromPeg, auxPeg, toPeg);

        System.out.println("Move disk from: " + fromPeg + " to: " + toPeg);

        towersOfHanoi(n - 1, auxPeg, toPeg, fromPeg);
    }

    public static void main(String[] args) {
        towersOfHanoi(4, 'A', 'C', 'B');
    }
}
