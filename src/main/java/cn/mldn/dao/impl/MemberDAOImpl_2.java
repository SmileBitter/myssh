package cn.mldn.dao.impl;

import cn.mldn.dao.IMemberDAO;
import cn.mldn.domain.Member;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: Dony
 * Date: 2018/5/3
 * Time: 20:02
 * Description:
 */
public class MemberDAOImpl_2 implements IMemberDAO {

    /**
     * Spring 负责管理Session的打开与关闭
     */
    @Resource
    private SessionFactory sessionFactory;

    @Override
    public boolean doCreate(Member vo) throws Exception {
        return this.sessionFactory.getCurrentSession().save(vo) != null;
    }

    @Override
    public Member findById(int id) throws Exception {
        return this.sessionFactory.getCurrentSession().get(Member.class, id);
    }
}
