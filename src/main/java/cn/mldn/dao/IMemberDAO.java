package cn.mldn.dao;

import cn.mldn.domain.Member;

public interface IMemberDAO {
	public boolean doCreate(Member vo) throws Exception ;
	public Member findById(int id) throws Exception ;
}
 