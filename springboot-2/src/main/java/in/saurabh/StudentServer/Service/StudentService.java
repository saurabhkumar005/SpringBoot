package in.saurabh.StudentServer.Service;

import in.saurabh.StudentServer.Entity.Student;
import in.saurabh.StudentServer.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class StudentService {
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student studentValidator(Student student){
        int id = student.getId();
        String name = student.getName();
        String department = student.getDepartment();
        int age = student.getAge();

        student.setCreatedAt(LocalDateTime.now());
        student.setUpdatedAt(LocalDateTime.now());


        if(id<0 || name==null || age<=0 || department==null ){
            return null;
        }

        Student res = studentRepository.save(student);
        return res;
    }

    //update route

    public Student getStudentByID(int id){
        return studentRepository.findById(id).orElse(null);
    }

    public Student updateStudentByID(int id, Student student){
        Student oldStudent = studentRepository.findById(id).orElse(null);
        if(oldStudent==null){
            return null;
        }
        oldStudent.setAge(student.getAge());
        oldStudent.setDepartment(student.getDepartment());
        oldStudent.setName(student.getName());
        oldStudent.setUpdatedAt(LocalDateTime.now());

        Student res = studentRepository.save(oldStudent);
        return res;

    }

    public Student deleteStudentByID(int id){
        Student res = studentRepository.findById(id).orElse(null);
        if(res==null){
            return null;
        }
        studentRepository.delete(res);
        return res;
    }


}

