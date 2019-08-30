/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xzn.shop.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.shardingsphere.api.config.sharding.TableRuleConfiguration;
import org.apache.shardingsphere.shardingjdbc.api.yaml.YamlShardingDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class ShardingDatabasesAndTablesConfigurationPrecise{

    @Bean
    public DataSource getShardingDataSource() throws IOException,SQLException{
        DataSource dataSource = YamlShardingDataSourceFactory.createDataSource(getFile("/sharding-jdbc.yaml"));
        return dataSource;
//        ShardingRuleConfiguration shardingRuleConfig = new ShardingRuleConfiguration();
//        TableRuleConfiguration tableRuleConfiguration = getOrderTableRuleConfiguration();
//        tableRuleConfiguration.setDatabaseShardingStrategyConfig(new InlineShardingStrategyConfiguration("user_id", "ds_${user_id % 2}"));
//        tableRuleConfiguration.setTableShardingStrategyConfig(new InlineShardingStrategyConfiguration("user_id", "t_order${user_id % 3}"));
//        shardingRuleConfig.getTableRuleConfigs().add(tableRuleConfiguration);
//        shardingRuleConfig.setDefaultDatabaseShardingStrategyConfig(new InlineShardingStrategyConfiguration("user_id", "ds_${user_id % 2}"));
//        shardingRuleConfig.setDefaultTableShardingStrategyConfig(new InlineShardingStrategyConfiguration("user_id", "t_order${user_id % 3}"));
//        return ShardingDataSourceFactory.createDataSource(createDataSourceMap(), shardingRuleConfig, new Properties());
    }


    private static File getFile(final String fileName) {
        return new File(Thread.currentThread().getClass().getResource(fileName).getFile());
    }

    TableRuleConfiguration getOrderTableRuleConfiguration() {
        TableRuleConfiguration result = new TableRuleConfiguration("t_order", "ds_${0..1}.t_order${0..2}");
        return result;
    }

    Map<String, DataSource> createDataSourceMap() throws SQLException{
        Map<String, DataSource> result = new HashMap<>();
        result.put("ds_0", getDs0DataSource());
        result.put("ds_1", getDs1DataSource());
        return result;
    }

//    @Bean
    public DataSource getDs0DataSource() throws SQLException{
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("7356241");
        druidDataSource.setUrl("jdbc:mysql://192.168.11.188:3306/order_0");
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return druidDataSource;
    }

    public DataSource getDs1DataSource() throws SQLException{
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("7356241");
        druidDataSource.setUrl("jdbc:mysql://192.168.11.188:3306/order_1");
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return druidDataSource;
    }




}
