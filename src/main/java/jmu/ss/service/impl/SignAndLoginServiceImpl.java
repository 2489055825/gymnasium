package jmu.ss.service.impl;

import jmu.ss.dao.CoachDAO;
import jmu.ss.dao.UsersDAO;
import jmu.ss.entity.Users;
import jmu.ss.service.SignAndLoginService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignAndLoginServiceImpl implements SignAndLoginService {
    @Autowired
    private UsersDAO usersDAO;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    private SqlSession sqlSession = sqlSessionFactory.openSession();;



    @Override
    public boolean sign(Users users) {
        boolean flag = usersDAO.insert(users);
        if(flag){
            this.sqlSession.commit();
        }
        return flag;
    }

    @Override
    public boolean login(String account, String password) {
        boolean flag = false;
        Users users = usersDAO.queryByUserAccount(account);
        if(password.equals(users)){
            flag = true;
        }
        return flag;
    }


}
