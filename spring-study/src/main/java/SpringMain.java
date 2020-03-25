import com.sun.zq.CityService;
import com.sun.zq.MyApp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApp.class);

		CityService cityService = context.getBean(CityService.class);
		cityService.say();



	}
}
