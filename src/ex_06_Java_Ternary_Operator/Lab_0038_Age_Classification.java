package ex_06_Java_Ternary_Operator;

public class Lab_0038_Age_Classification {
    public static void main(String[] args) {
        int age = 25;
        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);
    }
}
