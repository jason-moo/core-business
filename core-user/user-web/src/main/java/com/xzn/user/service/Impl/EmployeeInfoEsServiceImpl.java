package com.xzn.user.service.Impl;

import com.xzn.user.entity.EmployeeInfo;
import com.xzn.user.entity.EmployeeInfoEs;
import com.xzn.user.service.EmployeeInfoEsService;
import com.xzn.user.service.EmployeeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeInfoEsServiceImpl implements EmployeeInfoEsService {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    private EmployeeInfoService employeeInfoService;

    @Override
    public void bulk() {
        List<EmployeeInfo> employeeInfoList = employeeInfoService.selectList(null);
        List<IndexQuery> indexQueries = employeeInfoList.parallelStream().map(e ->{
            IndexQuery indexQuery = new IndexQuery();
            indexQuery.setIndexName("employee");
            indexQuery.setType("employee_info");
            indexQuery.setId(e.getId());
            indexQuery.setObject(e);
            return indexQuery;
        }).collect(Collectors.toList());
        elasticsearchTemplate.deleteIndex("employee");
        elasticsearchTemplate.createIndex(EmployeeInfoEs.class);
        elasticsearchTemplate.bulkIndex(indexQueries);
    }
}
