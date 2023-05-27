package jmu.ss.service.impl;

import jmu.ss.dao.UsersDAO;
import jmu.ss.entity.Users;
import jmu.ss.service.SignAndLoginService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignAndLoginServiceImpl implements SignAndLoginService {
    @Autowired
    private UsersDAO usersDAO;

    @Override
    public boolean sign(Users users) {
        boolean flag = usersDAO.insert(users);
        return flag;
    }

    @Override
    public Users login(String account, String password) {
        Users users = usersDAO.queryByUserAccount(account);
        if(!password.equals(users.getPassword())){
            users = null;
        }
        return users;
    }


}
