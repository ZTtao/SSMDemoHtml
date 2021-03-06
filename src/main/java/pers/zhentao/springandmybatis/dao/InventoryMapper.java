package pers.zhentao.springandmybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.zhentao.springandmybatis.pojo.Inventory;
import pers.zhentao.springandmybatis.pojo.InventoryExample;

public interface InventoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated
     */
    int countByExample(InventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated
     */
    int deleteByExample(InventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer inventoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated
     */
    int insert(Inventory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated
     */
    int insertSelective(Inventory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated
     */
    List<Inventory> selectByExample(InventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated
     */
    Inventory selectByPrimaryKey(Integer inventoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Inventory record, @Param("example") InventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Inventory record, @Param("example") InventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Inventory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Inventory record);
}