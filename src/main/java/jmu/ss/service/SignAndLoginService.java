package jmu.ss.service;

import jmu.ss.entity.Users;

public interface SignAndLoginService {
    /**
     * 注册账号
     *
     * @param users
     * @return
     * */
    boolean sign(Users users);

    /**
     * 验证登录
     *
     * @param account
     * @param password
     * @return
     * */
    Users login(String account, String password);
}
