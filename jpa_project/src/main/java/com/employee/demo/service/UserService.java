package com.employee.demo.service;

import com.employee.demo.entity.User;
import com.employee.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    // final은 constant(const 임) immutable이라는. 불변.

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> findAll() { // List<User> 이게 json구조.
        return userRepository.findAll();
    }

    // 삽입
    public User create(User user) {
        // object로 데이터를 받는이유. 프론트에서 form태그가 object로 되어있기 때문. 당연함.
        // java에서는 클래스가 object.
        return userRepository.save(user);  // 저장
    }

    public User getUserByName(String userName) {
        return userRepository.findByUserName(userName);  // 이렇게 userName으로 받으면 얘가 찾아줌.
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
