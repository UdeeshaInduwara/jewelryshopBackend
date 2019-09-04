package com.lk.ijse.service.impl;

import com.lk.ijse.dto.UserDto;
import com.lk.ijse.entity.User;
import com.lk.ijse.repository.UserRepository;
import com.lk.ijse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean canAuthenticate(UserDto userDto) {
        if (!userRepository.existsById(userDto.getUserName())) {
            return false;
        } else {
            User user = userRepository.findById(userDto.getUserName()).get();
            return user.getPassword().equals(userDto.getPassword());
        }
    }
}
