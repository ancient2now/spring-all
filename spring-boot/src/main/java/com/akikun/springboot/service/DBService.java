package com.akikun.springboot.service;

import java.util.List;

import com.akikun.springboot.dao.DBMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    private final DBMapper dbMapper;

    private final JdbcTemplate jdbcTemplate;

    private DBService (DBMapper dbMapper, JdbcTemplate jdbcTemplate) {
        this.dbMapper = dbMapper;
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<String> getAllTableNames() {
        return dbMapper.selectAllTableNames();
    }

    public int countTables() {
        String sql = "select count(*) from activity";
        Integer ans = jdbcTemplate.queryForObject(sql, Integer.class);
        return ans == null ? 0 : ans;
    }

}
