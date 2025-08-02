package ma.zyn.springboot_deploy.ws;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/deploy/test")
public class DeployWs {

    // test eetjjte ff 44eee
    @GetMapping
    public String deploy() {
        return "Test Deploy in Railway!";
    }
}
