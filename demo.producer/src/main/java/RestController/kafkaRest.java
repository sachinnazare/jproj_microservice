package RestController;
import com.example.producer.demo.producer.kafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
public class kafkaRest {

    @Autowired
    public kafkaProducerService  kafkaProducerService;

    @PostMapping("/publish")
    public String publishMessage(@RequestBody String message) {
        kafkaProducerService.sendMessage(message);
        return "Message sent to Kafka!";
    }
}
