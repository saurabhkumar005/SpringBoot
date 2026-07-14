package in.saurabh.StudentServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServer {
    // 1. Store the student
    @PostMapping("/create")
    public String storeStudent(){
        return """
                id: 1
                name: Saurabh
                Departement: CSE
                age: 20
                """;
    }

    // 2. Read the Student with id

    // 3. Update the student information

    // 4. delete the student information
}
