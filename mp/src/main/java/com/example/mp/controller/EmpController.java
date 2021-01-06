package com.example.mp.controller;


import com.example.mp.entity.Emp;
import com.example.mp.service.IEmpService;
import com.example.mp.service.impl.EmpServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zjz
 * @since 2021-01-06
 */
@Slf4j
@RestController
@RequestMapping("/mp/emp")
public class EmpController {

    @Autowired
    private IEmpService empService;

    @GetMapping("/get/{id}")
    public Emp get(@PathVariable("id") Long id){
        System.out.println(empService.getById(id));
        return empService.getById(id);
    }
}
