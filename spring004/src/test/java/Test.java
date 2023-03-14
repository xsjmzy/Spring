import com.ioc.controller.CalculatorController;
import com.ioc.service.CaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.jupiter.api.Test
    public void Test(){
        ApplicationContext appContext=new ClassPathXmlApplicationContext("spring-config.xml");
       CaService cs= (CaService) appContext.getBean("cx");
        double add=cs.methods(8,7);
        System.out.println(add);

        CaService cs1= (CaService) appContext.getBean("cx1");
        double sub=cs1.methods(8,7);
        System.out.println(sub);

        CaService cs2= (CaService) appContext.getBean("cx2");
        double mu=cs2.methods(8,7);
        System.out.println(mu);

        CaService cs3= (CaService) appContext.getBean("cx3");
        double de=cs3.methods(8,7);
        System.out.println(de);
    }
}
