package in.saurabh.Scope;

import in.saurabh.StudentServer.Entity.Student;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
public class LPU {


    public LPU(){
        System.out.println("LPU Ranks 1");
    }

    public void admission(Student student){
        System.out.println("Student get admission");
    }

    public void exam(){
        System.out.println("Student Exam ");

    }

    public void placement(){
        System.out.println("Student get placed!");
    }

}
