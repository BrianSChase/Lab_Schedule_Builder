package scheduleing;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

//@RestController
//@EnableAutoConfiguration
@SpringBootApplication
public class ScheduleBuilder {

  //  @RequestMapping("/")
   // String home() {
   //     return "Hello World!";
   // }

    public static void main(String[] args) {
        SpringApplication.run(ScheduleBuilder.class, args);
    }

}