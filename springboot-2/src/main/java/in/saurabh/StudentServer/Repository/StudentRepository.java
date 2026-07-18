package in.saurabh.StudentServer.Repository;

import in.saurabh.StudentServer.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Integer> {



//    public Student save(Student student){
//        System.out.println("Student Information Saved!");
//        System.out.println(student);
//        return student;
//    }
}
