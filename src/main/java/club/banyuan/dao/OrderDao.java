package club.banyuan.dao;

import club.banyuan.pojo.Order;
import club.banyuan.pojo.User;

import java.util.List;

public interface OrderDao {
//    public List<User> getAll();
//    public int addUser(User user);
//    public int updateUser(User newUser);
//    public int delUser(int id);
    public List<Order> getAll();
    public int addOrder(Order order);
    public int updateOrder(Order newOrder);
    public int delOrder(int id);
}
