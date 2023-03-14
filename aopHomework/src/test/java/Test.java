import com.aop.config.AppConfig;
import com.aop.service.DutyDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    @org.junit.jupiter.api.Test
    public void testHomework(){
        ApplicationContext app=new AnnotationConfigApplicationContext(AppConfig.class);
         DutyDao duty= (DutyDao) app.getBean("duty");

         duty.sayHello();
         duty.eating();
         duty.goShopping();
         duty.sleep();
         duty.speakingChinese();

    }
}
