import com.dzy.dao.AccountDao;
import com.dzy.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class TestSSM {
    @Test
    public void testSpring(){
        // 整合时  将此配置文件的加载交给 web.xml中的监听器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.selectAll();
    }

    @Test
    public void testMybatis() throws Exception {
        // 整合时  在spring的配置文件中直接配置SqlMapConf.xml中的内容 用了spring-mybatis这个jar包
        // 整合之后 这个配置文件就不需要了
        InputStream in = Resources.getResourceAsStream("SqlMapConf.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();

        AccountDao dao = sqlSession.getMapper(AccountDao.class);

        dao.selectAll().forEach(System.out::println);

        sqlSession.close();
        in.close();
    }
}
