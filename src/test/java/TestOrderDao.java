import club.banyuan.dao.OrderDao;
import club.banyuan.pojo.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestOrderDao {
    SqlSession session = null;
    @Before
    public void init() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        session = sqlSessionFactory.openSession();
    }
    @After
    public void destroy(){
        session.commit();
        session.close();
    }
    @Test
    public void testGetAll() throws IOException{
        OrderDao orderDao = session.getMapper(OrderDao.class);
        List<Order> orderList = orderDao.getAll();
        System.out.println(orderList.size());
        for (Order order : orderList) {
            System.out.println(order);
        }
    }


}
