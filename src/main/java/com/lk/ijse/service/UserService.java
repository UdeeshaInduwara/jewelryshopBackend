package com.lk.ijse.service;

import com.lk.ijse.dto.UserDto;

public interface UserService {

    boolean canAuthenticate(UserDto userDto);
}
