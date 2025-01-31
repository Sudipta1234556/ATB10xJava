package ex_07_Increament_Decrement_OP;

public class Largestof3Numbers_Using_TerneryOp {
    public static void main(String[] args) {
        int n1 = 50, n2 = 70, n3 = 40;

        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2>=n3) ? n2 : n3);
        System.out.println(largest);
    }
}

