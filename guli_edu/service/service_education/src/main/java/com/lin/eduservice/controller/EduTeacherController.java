package com.lin.eduservice.controller;


import com.lin.commonutils.Result;
import com.lin.eduservice.entity.EduTeacher;
import com.lin.eduservice.service.EduTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-12-22
 */
@Api(value = "老师列表")
@RestController
@RequestMapping("/eduservice/edu-teacher")
public class EduTeacherController {
    @Autowired
    private EduTeacherService eduTeacherService;
    @ApiOperation(value = "查询全体老师")
    @GetMapping("/findAll")
    public Result findAll(){
        List<EduTeacher> list = eduTeacherService.list(null);
        return Result.ok().data("item",list);
    }
    @DeleteMapping("{id}")
    public Result deleteById(@PathVariable String id){
        return eduTeacherService.removeById(id)?Result.ok():Result.error();
    }
}

