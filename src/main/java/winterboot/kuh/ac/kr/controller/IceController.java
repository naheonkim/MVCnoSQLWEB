package winterboot.kuh.ac.kr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IceController {
    @GetMapping("/ice")
    public String ice() {
        System.out.println("IceController Test");
        return "ice.html";
    }
}


//MVCnoSQLWEB
//IntelliJ, SpringBoot, JAVA, graphQL