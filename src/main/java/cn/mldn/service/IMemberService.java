package cn.mldn.service;

import cn.mldn.domain.Member;

public interface IMemberService {
    public boolean add(Member vo) throws Exception;

    public Member get(int mid) throws Exception;
}
