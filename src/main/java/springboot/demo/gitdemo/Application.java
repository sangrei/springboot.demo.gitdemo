package springboot.demo.gitdemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	static Logger logger = LoggerFactory.getLogger(Application.class); 
	
	public static void main(String[] args) {
		logger.info("Start app.");
		SpringApplication.run(Application.class, args);
	}
	
    
	@RequestMapping(value="/index")
    public String index(){
		
		logger.info("/index");
		logger.error("/index/error");
        return "gitdemo index.ps:update.v1.2."+new Date();
    }
}
