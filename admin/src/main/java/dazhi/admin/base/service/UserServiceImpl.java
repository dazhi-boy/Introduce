package dazhi.admin.base.service;

import dazhi.admin.base.entity.User;
import dazhi.admin.base.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserRepository userRepository;

    public List<User> getUserList() {
        List<User> userList = userRepository.findAll();
        return userList;
    }

//    public List<User> find() {
//        List<User> list = null;
//        try {
//            list = userRepository.find();
//        } catch (Exception e) {
//        }
//        return list;
//    }

//    public String deleteUserById(Long id){
//        int  a = userRepository.deleteUserById(id);
//        return "chenggong";
//    }

//    public String queryUserById(Long id ,String name){
//        Long a = userRepository.queryUserById(id,name);
//        return "成功";
//    }

//    public String countUserBy(Integer id ,String name ,String password){
//        int a = userRepository.countUserBy(id,name,password);
//        return "成功";
//    }
}
