package com.lk.ijse.service.impl;

import com.lk.ijse.repository.GemRepository;
import com.lk.ijse.service.GemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class GemServiceImpl implements GemService {

    @Autowired
    private GemRepository gemRepository;
}
