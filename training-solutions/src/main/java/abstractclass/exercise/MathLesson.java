package abstractclass.exercise;

public class MathLesson {

    public static void main(String[] args) {

        MathExercise mathExerciseAdder = new Adder();
        MathExercise mathExerciseSubtracter = new Subtracter();
        MathExercise mathExerciseMultiplier = new Multiplier();
        MathExercise mathExerciseDivisor = new Divisor();

        System.out.println(mathExerciseAdder.getSolution(8, 5));
        System.out.println(mathExerciseSubtracter.getSolution(8, 5));
        System.out.println(mathExerciseMultiplier.getSolution(8, 5));
        System.out.println(mathExerciseDivisor.getSolution(8, 5));
    }
}
