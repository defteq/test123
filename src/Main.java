import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Student student = new Student();
        student.setStudent_name("Максим Иванов");
        student.setStudent_age(19);
        student.setStrudent_faculty("Факультет наук о материалах");

        String p = LocalPC.getPasswort();

        System.out.println(student.student_name);
        System.out.println(student.student_age);
        System.out.println(student.strudent_faculty);
        System.out.println(p);
        System.out.println("v2");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 50; i++) {
            numbers.add(1);
            numbers.add(2);
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        Persent persent = new Persent();


        System.out.println(persent.getProduct_completion_percentage());

        String time = String.valueOf(LocalTime.now());
        System.out.println(time);
        System.out.println(time.substring(8, 10) +":"+time.substring(11, 13));

//        ArrayList<Integer> estimates = new ArrayList<>();
//        ArrayList<Integer> estimates1 = new ArrayList<>();
//        estimates.add(1);
//        estimates1.add(2);
//
//        for (int i = 0; i < 26; i++){
//            System.out.print(estimates);
//        }
    }
}
