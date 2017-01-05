package pers.zhentao.springandmybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.zhentao.springandmybatis.pojo.Actor;
import pers.zhentao.springandmybatis.pojo.ActorExample;

public interface ActorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbggenerated
     */
    int countByExample(ActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbggenerated
     */
    int deleteByExample(ActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Short actorId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbggenerated
     */
    int insert(Actor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbggenerated
     */
    int insertSelective(Actor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbggenerated
     */
    List<Actor> selectByExample(ActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbggenerated
     */
    Actor selectByPrimaryKey(Short actorId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Actor record, @Param("example") ActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Actor record, @Param("example") ActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Actor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Actor record);
}