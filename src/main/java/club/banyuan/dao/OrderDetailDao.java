package club.banyuan.dao;

import club.banyuan.pojo.OrderDetail;
import club.banyuan.pojo.Product;
import club.banyuan.vo.PageVO;
import club.banyuan.vo.ProductVO;

import java.util.List;
import java.util.Map;

public interface OrderDetailDao {
//    public List<Product> getAll();
//    public List<Product> getProductByPrice(Map map);
//    public List<Product> getProductByNameOrDesc(String key);
//    public List<Product> getProductByParam(ProductVO productVO);
//    public int countProductRows();
//    public List<PageVO> countLevel1ProductRows();
    public List<OrderDetail> getAll();
    public List<OrderDetail> getOrderDetailById(int id);
    public int addOrderDetail(OrderDetail orderDetail);
    public int updateOrderDetail(OrderDetail newOrderDetail);
    public int delOrderDetail(int id);

}
