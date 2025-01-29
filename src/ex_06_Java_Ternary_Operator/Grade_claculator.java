package ex_06_Java_Ternary_Operator;

public class Grade_claculator {
    public static void main(String[] args) {
        int mark = 94;
        String grade = (mark<=59)?"F": (mark<=69) ?"D": (mark<=79) ? "C":(mark<=89)? "A":(mark<=90) ? "B":"A";
        System.out.println(grade);
    }
}
