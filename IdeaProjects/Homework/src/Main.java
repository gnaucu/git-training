import com.endava.internship.Student;
import com.endava.internship.StudentSet;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args){

        StudentSet set = new StudentSet();
        LocalDate dt = LocalDate.now();
        Student s1 = new Student("Ion",dt ,"student");
        Student s2 = new Student ("Andrei", dt, "economist");
        Student s4 = new Student ("Alexandru", dt, "economist");
        Student s3 = new Student ("Mihai", dt, "economist");
        set.add(s1);
        set.add(s2);
        set.add(s4);
        set.add(s3);
        set.size();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains(s1));
    }
}
