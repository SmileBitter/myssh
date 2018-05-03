package cn.mldn.dao.impl;

import cn.mldn.dao.IMemberDAO;
import cn.mldn.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: Dony
 * Date: 2018/5/3
 * Time: 18:14
 * Description:
 */
@Component
public class MemberDAOImpl extends HibernateDaoSupport implements IMemberDAO {

    @Autowired
    public MemberDAOImpl(HibernateTemplate hibernateTemplate) {
        super.setHibernateTemplate(hibernateTemplate);
    }

    @Override
    public boolean doCreate(Member vo) throws Exception {
        return super.currentSession().save(vo) != null;
    }

    @Override
    public Member findById(int id) throws Exception {
        return super.currentSession().get(Member.class, id);
    }
}
