package com.xiaomaigou.mapper;

import com.xiaomaigou.pojo.TbGoods;
import com.xiaomaigou.pojo.TbGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    long countByExample(TbGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    int deleteByExample(TbGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    int insert(TbGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    int insertSelective(TbGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    List<TbGoods> selectByExample(TbGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    TbGoods selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    int updateByExampleSelective(@Param("record") TbGoods record, @Param("example") TbGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    int updateByExample(@Param("record") TbGoods record, @Param("example") TbGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    int updateByPrimaryKeySelective(TbGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    int updateByPrimaryKey(TbGoods record);
}