import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



    @RestController
    public class App {
    @RequestMapping("/")
    String home() {
        return "Hello Heroku!";
    }
}
