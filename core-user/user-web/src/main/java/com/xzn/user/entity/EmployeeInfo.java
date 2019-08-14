package com.xzn.user.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

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
public class EmployeeInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 员工编码
     */
    private String code;

    /**
     * 岗位
     */
    private String job;

    /**
     * 岗位类别
     */
    private String type;

    /**
     * 岗位序列
     */
    private String jobSeq;

    /**
     * 岗位等级
     */
    private String jobLevel;

    /**
     * 民族
     */
    private String nation;

    /**
     * 性别
     */
    private String sex;

    /**
     * 文化程度
     */
    private String culture;

    /**
     * 政治面貌
     */
    private String face;

    /**
     * 出生日期
     */
    private String birthDate;

    /**
     * 身份证
     */
    private String idNumber;

    /**
     * 籍贯
     */
    private String nativePlace;

    /**
     * 户口性质
     */
    private String residenceProperties;

    /**
     * 用工形式
     */
    private String employmentSituation;

    /**
     * 所属公司
     */
    private String pkCorp;

    /**
     * 工作时间
     */
    private String workTime;

    private String leaveTime;

    /**
     * 进入公司时间
     */
    private String joinTime;

    /**
     * 技术职称
     */
    private String technicalTitle;

    /**
     * 考勤卡号
     */
    private String cardNumber;

    /**
     * 餐费卡号
     */
    private String mealCard;

    /**
     * 餐费补贴
     */
    private String mealAllowance;

    /**
     * 薪资等级
     */
    private String payGrade;

    /**
     * OA账号
     */
    private String oaNumber;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 座机
     */
    private String landline;

    /**
     * 邮箱
     */
    private String email;

    /**
     * QQ
     */
    private String qq;

    /**
     * 微信
     */
    @TableField("weChat")
    private String weChat;

    /**
     * 部门主键
     */
    private String pkDept;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 区域主键
     */
    private String pkArea;

    /**
     * 区域名称
     */
    private String areaName;

    /**
     * 公司名称
     */
    private String corpName;

    /**
     * 员工管理档案主键
     */
    private String pkPsndoc;

    /**
     * 岗位id
     */
    private String pkOmJob;


}
