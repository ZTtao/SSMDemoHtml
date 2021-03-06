package pers.zhentao.springandmybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.zhentao.springandmybatis.pojo.Rental;
import pers.zhentao.springandmybatis.pojo.RentalExample;

public interface RentalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated
     */
    int countByExample(RentalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated
     */
    int deleteByExample(RentalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer rentalId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated
     */
    int insert(Rental record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated
     */
    int insertSelective(Rental record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated
     */
    List<Rental> selectByExample(RentalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated
     */
    Rental selectByPrimaryKey(Integer rentalId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Rental record, @Param("example") RentalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Rental record, @Param("example") RentalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Rental record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rental
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Rental record);
}