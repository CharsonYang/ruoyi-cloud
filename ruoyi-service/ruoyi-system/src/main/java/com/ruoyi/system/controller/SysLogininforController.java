package com.ruoyi.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.system.domain.SysLogininfor;
import com.ruoyi.system.service.ISysLogininforService;

/**
 * 系统访问记录 提供者
 * 
 * @author zmr
 * @date 2019-05-20
 */
@RestController
@RequestMapping("logininfor")
public class SysLogininforController extends BaseController
{
    @Autowired
    private ISysLogininforService sysLogininforService;

    /**
     * 查询系统访问记录列表
     */
    @GetMapping("list")
    public List<SysLogininfor> list(SysLogininfor sysLogininfor)
    {
        startPage();
        return sysLogininforService.selectLogininforList(sysLogininfor);
    }

    /**
     * 新增保存系统访问记录
     */
    @PostMapping("save")
    public void addSave(@RequestBody SysLogininfor sysLogininfor)
    {
        sysLogininforService.insertLogininfor(sysLogininfor);
    }

    /**
     * 删除系统访问记录
     */
    @PostMapping("remove")
    public int remove(String ids)
    {
        return sysLogininforService.deleteLogininforByIds(ids);
    }
}
