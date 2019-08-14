package com.xzn.user.service.impl;

import com.xzn.user.entity.EmployeeInfo;
import com.xzn.user.mapper.EmployeeInfoMapper;
import com.xzn.user.service.EmployeeInfoService;
import com.xzn.user.service.Impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工基本信息 服务实现类
 * </p>
 *
 * @author xuezn
 * @since 2019-08-14
 */
@Service
public class EmployeeInfoServiceImpl extends BaseServiceImpl<EmployeeInfoMapper, EmployeeInfo> implements EmployeeInfoService {

}
