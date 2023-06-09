import com.kuang.mapper.Usermapper;
import com.kuang.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void test() throws IOException {
        String resources="mybatis-config.xml";
        InputStream in =Resources.getResourceAsStream(resources);
        SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession=sessionFactory.openSession(true);


        Usermapper mapper=sqlSession.getMapper(Usermapper.class);
        List<User> userList=mapper.selectUser();

        for(User user :userList){
            System.out.println(user);
        }
    }
}
