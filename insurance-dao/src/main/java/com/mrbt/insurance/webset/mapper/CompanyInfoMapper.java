package com.mrbt.insurance.webset.mapper;

import com.mrbt.insurance.webset.model.CompanyInfo;
import com.mrbt.insurance.webset.model.CompanyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated
     */
    int countByExample(CompanyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated
     */
    int deleteByExample(CompanyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated
     */
    int insert(CompanyInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated
     */
    int insertSelective(CompanyInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated
     */
    List<CompanyInfo> selectByExample(CompanyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated
     */
    CompanyInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CompanyInfo record, @Param("example") CompanyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CompanyInfo record, @Param("example") CompanyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CompanyInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CompanyInfo record);
}