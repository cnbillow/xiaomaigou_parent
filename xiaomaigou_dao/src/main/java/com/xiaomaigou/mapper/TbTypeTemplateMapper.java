package com.xiaomaigou.mapper;

import com.xiaomaigou.pojo.TbTypeTemplate;
import com.xiaomaigou.pojo.TbTypeTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbTypeTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    long countByExample(TbTypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    int deleteByExample(TbTypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    int insert(TbTypeTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    int insertSelective(TbTypeTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    List<TbTypeTemplate> selectByExample(TbTypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    TbTypeTemplate selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    int updateByExampleSelective(@Param("record") TbTypeTemplate record, @Param("example") TbTypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    int updateByExample(@Param("record") TbTypeTemplate record, @Param("example") TbTypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    int updateByPrimaryKeySelective(TbTypeTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    int updateByPrimaryKey(TbTypeTemplate record);
}