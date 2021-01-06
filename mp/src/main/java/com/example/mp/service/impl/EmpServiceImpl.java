package com.example.mp.service.impl;

import com.example.mp.entity.Emp;
import com.example.mp.mapper.EmpMapper;
import com.example.mp.service.IEmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zjz
 * @since 2021-01-06
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements IEmpService {

}
