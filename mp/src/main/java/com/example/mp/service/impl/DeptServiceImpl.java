package com.example.mp.service.impl;

import com.example.mp.entity.Dept;
import com.example.mp.mapper.DeptMapper;
import com.example.mp.service.IDeptService;
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
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
