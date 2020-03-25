import com.sun.zq.CityService;
import com.sun.zq.MyApp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApp.class);

		HelloService helloService = context.getBean(HelloServiceImpl.class);
		helloService.hello("sunzheng");

		System.out.println(helloService instanceof HelloServiceImpl);



	}
}
