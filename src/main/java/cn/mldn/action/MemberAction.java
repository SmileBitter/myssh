package cn.mldn.action;

import cn.mldn.domain.Member;
import cn.mldn.service.IMemberService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: Dony
 * Date: 2018/5/3
 * Time: 18:21
 * Description:
 */
@Repository
@ParentPackage("root")
@Namespace("/pages/back/member")
@Action("member")
public class MemberAction extends ActionSupport {
    @Resource
    private IMemberService memberService;

    private Member member = new Member();

    public Member getMember() {
        return member;
    }

    public void add() {
        try {
            System.out.println("【增加member数据】"
                    + this.memberService.add(this.member));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void get() {
        try {
            System.out.println("【查询member数据】"
                    + this.memberService.get(this.member.getMid()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
