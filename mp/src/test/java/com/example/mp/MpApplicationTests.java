package com.example.mp;

import com.example.mp.entity.Emp;
import com.example.mp.mapper.EmpMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MpApplicationTests {

    @Resource
    private EmpMapper empMapper;
    @Test
    void contextLoads() {
        Emp emp = empMapper.selectById(7369);
        System.out.println(emp);
    }

}
