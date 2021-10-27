import eda.domain.Users;
import eda.mapper.UsersMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ttttt {


    @Test
    public void Test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        UsersMapper mapper=context.getBean(UsersMapper.class);

        Users admin = mapper.login("admin");
        System.out.println(admin);
    }
}
