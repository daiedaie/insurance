package com.mrbt.insurance.webset.mapper;

import com.mrbt.insurance.webset.model.UsersInsuredInfo;
import com.mrbt.insurance.webset.model.UsersInsuredInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersInsuredInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_insured_info
     *
     * @mbggenerated
     */
    int countByExample(UsersInsuredInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_insured_info
     *
     * @mbggenerated
     */
    int deleteByExample(UsersInsuredInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_insured_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_insured_info
     *
     * @mbggenerated
     */
    int insert(UsersInsuredInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_insured_info
     *
     * @mbggenerated
     */
    int insertSelective(UsersInsuredInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_insured_info
     *
     * @mbggenerated
     */
    List<UsersInsuredInfo> selectByExample(UsersInsuredInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_insured_info
     *
     * @mbggenerated
     */
    UsersInsuredInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_insured_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UsersInsuredInfo record, @Param("example") UsersInsuredInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_insured_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UsersInsuredInfo record, @Param("example") UsersInsuredInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_insured_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UsersInsuredInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_insured_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UsersInsuredInfo record);
}