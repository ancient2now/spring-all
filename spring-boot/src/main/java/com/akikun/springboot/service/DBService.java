package com.akikun.springboot.service;

import java.util.List;

import com.akikun.springboot.dao.DBMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    @Autowired
    private DBMapper dbMapper;

    public List<String> getAllTableNames() {
        return dbMapper.selectAllTableNames();
    }
}
