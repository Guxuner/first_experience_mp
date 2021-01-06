package com.example.mp.entity;

import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * <p>
 * 
 * </p>
 *
 * @author zjz
 * @since 2021-01-06
 */
@Data
@ToString
@EqualsAndHashCode(callSuper = false)
public class Emp implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("EMPNO")
    private Integer empno;

    @TableField("ENAME")
    private String ename;

    @TableField("JOB")
    private String job;

    @TableField("MGR")
    private Integer mgr;

    @TableField("HIREDATE")
    private LocalDate hiredate;

    @TableField("SAL")
    private Double sal;

    @TableField("COMM")
    private Double comm;

    @TableField("DEPTNO")
    private Integer deptno;


}
