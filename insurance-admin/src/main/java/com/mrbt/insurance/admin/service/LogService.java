package com.mrbt.insurance.admin.service;

import com.mrbt.insurance.admin.model.SysLog;
import com.mrbt.insurance.admin.commons.utils.PageInfo;

/**
 * @description：操作日志
 * @author：ruochen.yu
 * @date：2015/10/30 10:35
 */
public interface LogService {

    void insertLog(SysLog sysLog);

    void findDataGrid(PageInfo pageInfo);
}
