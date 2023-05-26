package jmu.ss.dao;

import jmu.ss.entity.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UsersDAO {

    //插入一个用户
    @Insert("INSERT INTO users(userID, name, account, password, identity)\n" +
            "VALUES (#{userID}, #{name}, #{account}, #{password}, #{identity})")
    public boolean insert(Users users);

    //删除一个用户
    @Delete("DELETE\n" +
            "FROM users\n" +
            "WHERE userID = #{userID}")
    public boolean delete(int userID);

    //查询所有用户
    @Select("select * from users")
    public List<Users> queryAll();

    //查询一个用户通过用户ID
    @Select("select * from users where userID=#{userID}")
    public Users queryByUserID(int userID);

    //查询一个用户通过用户名
    @Select("select * from users where name=#{name}")
    public Users queryByUserName(String name);

    //查询一个用户通过账号
    @Select("select * from users where account=#{account}")
    public Users queryByUserAccount(String account);

    //修改一个用户信息
    @Update("update users\n" +
            "set name=#{name},account=#{account},password=#{password},identity=#{identity}\n" +
            "where userID=#{userID}")
    public boolean update(Users user);

}
