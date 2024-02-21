package samples;

public class ReverseArrayExample {
    public static void main(String[] args) {
        int ar[] = new int[6];

        // Initialize array elements
        ar[0] = 10;
        ar[1] = 20;
        ar[2] = 30;
        ar[3] = 40;
        ar[4] = 50;
        ar[5] = 60;
        
        

        // Reverse the order of elements in the array
        int length = ar.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = ar[i];
            ar[i] = ar[length - 1 - i];
            ar[length - 1 - i] = temp;
        }

        // Print the reversed array
        System.out.println("Reversed Array:");
        for (int e : ar) {
            System.out.println(e);
        }
    }
}
