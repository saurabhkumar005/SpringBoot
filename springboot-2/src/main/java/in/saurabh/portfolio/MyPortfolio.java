package in.saurabh.portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {

    @GetMapping("/myself")
    public String mySelf(){
        return """
                <h1>MySelf</h1>
                <p> Coder | Developer | Problem Solver | Learner </p>
                <ul>
                <li>github : www.github.com/saurabhkumar005 </li>
                <li> Linkedin: www.linkedin.com/saurabhkumar005 </li>
                </ul>
                """;
    }

    @GetMapping("/skills")
    public String mySkills(){
        return """
                <ol>
                <li>Java</li>
                <li> CPP </li>
                <li> Problem Solver </li>
                <li> MERN </li>
                <li> MYSQL </li>
                </ol>
                """;
    }

    @GetMapping("/education")
    public String myEducation(){
        return """
                <h1>My Education</h1>
                <h2> Graduation: B.Tech CSE (
                """;
    }

    @GetMapping("/projects")
    public String myProjects(){
        return """
                <h1> My Projects </h1>
                <h2> SyncMate</h2>
                <p> A Real Time Chatting Application </p>
                <p> Tech Stack: Node, Express, React, MySQL </p>
                <h2> Pg Finder </h2>
                <p> Tenants can upload their available pgs and student can see and contact them directly </p>
                <p> Tech Stack: MERN </p>
                """;
    }
}
