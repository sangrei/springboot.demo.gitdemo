package springboot.demo.gitdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Value("${user.name}") 
    private String name;
	
	@Value("${user.email}") 
    private String email;
    
	@RequestMapping("/")
    public String index(){
        return "gitdemo index.ps:update.v1.1.";
    }
	
    @RequestMapping("/userinfo")
    public String userinfo(){
        return name+","+email;
    }
}
