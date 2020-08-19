package exercises;

public class Array {
    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 5, 8};
        for (int j : array) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }
        String sentence = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] wordArray = sentence.split("\\.", 32);
        for (String a : wordArray) {
            System.out.println(a);
        }


    }
}
