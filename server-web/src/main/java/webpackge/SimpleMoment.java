package self.person.study.webPackge
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Created by Administrator on 2019/6/4.
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SimpleMoment {
        public static void main(String[] args) {
            SpringApplication.run(SimpleMoment.class, args);
        }

}
