package com.xzn.user.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * <p>
 * 员工基本信息
 * </p>
 *
 * @author xuezn
 * @since 2019-08-14
 */
@Data
@Document(indexName = "employee",shards = 3,replicas = 1)
public class EmployeeInfoEs implements Serializable {

    private static final long serialVersionUID = 1L;

    @Field(type = FieldType.Text)
    private String id;

    /**
     * 姓名
     */
    @Field(type = FieldType.Text)
    private String name;

    /**
     * 员工编码
     */
    @Field(type = FieldType.Text)
    private String code;

    /**
     * 岗位
     */
    @Field(type = FieldType.Text)
    private String job;

    /**
     * 岗位类别
     */
    @Field(type = FieldType.Text)
    private String type;

    /**
     * 岗位序列
     */
    @Field(type = FieldType.Text)
    private String jobSeq;

    /**
     * 岗位等级
     */
    @Field(type = FieldType.Text)
    private String jobLevel;

    /**
     * 民族
     */
    @Field(type = FieldType.Text)
    private String nation;

    /**
     * 性别
     */
    @Field(type = FieldType.Text)
    private String sex;

    /**
     * 文化程度
     */
    @Field(type = FieldType.Text)
    private String culture;

    /**
     * 政治面貌
     */
    @Field(type = FieldType.Text)
    private String face;

    /**
     * 出生日期
     */
    @Field(type = FieldType.Text)
    private String birthDate;

    /**
     * 身份证
     */
    @Field(type = FieldType.Text)
    private String idNumber;

    /**
     * 籍贯
     */
    @Field(type = FieldType.Text)
    private String nativePlace;

    /**
     * 户口性质
     */
    @Field(type = FieldType.Text)
    private String residenceProperties;

    /**
     * 用工形式
     */
    @Field(type = FieldType.Text)
    private String employmentSituation;

    /**
     * 所属公司
     */
    @Field(type = FieldType.Text)
    private String pkCorp;

    /**
     * 工作时间
     */
    @Field(type = FieldType.Text)
    private String workTime;

    @Field(type = FieldType.Text)
    private String leaveTime;

    /**
     * 进入公司时间
     */
    @Field(type = FieldType.Text)
    private String joinTime;

    /**
     * 技术职称
     */
    @Field(type = FieldType.Text)
    private String technicalTitle;

    /**
     * 考勤卡号
     */
    @Field(type = FieldType.Text)
    private String cardNumber;

    /**
     * 餐费卡号
     */
    @Field(type = FieldType.Text)
    private String mealCard;

    /**
     * 餐费补贴
     */
    @Field(type = FieldType.Text)
    private String mealAllowance;

    /**
     * 薪资等级
     */
    @Field(type = FieldType.Text)
    private String payGrade;

    /**
     * OA账号
     */
    @Field(type = FieldType.Text)
    private String oaNumber;

    /**
     * 手机
     */
    @Field(type = FieldType.Text)
    private String mobile;

    /**
     * 座机
     */
    @Field(type = FieldType.Text)
    private String landline;

    /**
     * 邮箱
     */
    @Field(type = FieldType.Text)
    private String email;

    /**
     * QQ
     */
    @Field(type = FieldType.Text)
    private String qq;

    /**
     * 微信
     */
    @Field(type = FieldType.Text)
    private String weChat;

    /**
     * 部门主键
     */
    @Field(type = FieldType.Text)
    private String pkDept;

    /**
     * 部门名称
     */

    @Field(type = FieldType.Text)
    private String deptName;

    /**
     * 区域主键
     */
    @Field(type = FieldType.Text)
    private String pkArea;

    /**
     * 区域名称
     */
    @Field(type = FieldType.Text)
    private String areaName;

    /**
     * 公司名称
     */
    @Field(type = FieldType.Text)
    private String corpName;

    /**
     * 员工管理档案主键
     */
    @Field(type = FieldType.Text)
    private String pkPsndoc;

    /**
     * 岗位id
     */
    @Field(type = FieldType.Text)
    private String pkOmJob;


}
