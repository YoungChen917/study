import com.itcast.domain.Items;
import com.itcast.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationConfig.xml");
        ItemsService service = (ItemsService) ac.getBean("itemsService");
        Items items = service.findById(1);
        System.out.println(items);
    }
}
