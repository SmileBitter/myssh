package cn.mldn.service.impl;

import cn.mldn.dao.IMemberDAO;
import cn.mldn.domain.Member;
import cn.mldn.service.IMemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: Dony
 * Date: 2018/5/3
 * Time: 18:18
 * Description:
 */
@Service
public class MemberServiceImpl implements IMemberService {

    @Resource
    private IMemberDAO memberDAO;

    @Override
    public boolean add(Member vo) throws Exception {
        return this.memberDAO.doCreate(vo);
    }

    @Override
    public Member get(int mid) throws Exception {
        return this.memberDAO.findById(mid);
    }
}
