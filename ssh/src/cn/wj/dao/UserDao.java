package cn.wj.dao;

import cn.wj.entity.User;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class UserDao {

    private HibernateTemplate hibernateTemplate;
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate){
        this.hibernateTemplate = hibernateTemplate;
    }

    public void add(){
        // 向表中添加记录
        // 使用hibernateTemplate实现添加
        // HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
        // hibernateTemplate.save(entity);
        System.out.println("dao..............");

        User user = new User();
        user.setUsername("李阿昀");
        user.setAddress("湖北天门");

        hibernateTemplate.save(user);
    }
}
