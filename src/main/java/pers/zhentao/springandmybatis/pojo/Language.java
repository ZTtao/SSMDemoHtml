package pers.zhentao.springandmybatis.pojo;

import java.util.Date;

public class Language {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column language.language_id
     *
     * @mbggenerated
     */
    private Byte languageId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column language.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column language.last_update
     *
     * @mbggenerated
     */
    private Date lastUpdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column language.language_id
     *
     * @return the value of language.language_id
     *
     * @mbggenerated
     */
    public Byte getLanguageId() {
        return languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column language.language_id
     *
     * @param languageId the value for language.language_id
     *
     * @mbggenerated
     */
    public void setLanguageId(Byte languageId) {
        this.languageId = languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column language.name
     *
     * @return the value of language.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column language.name
     *
     * @param name the value for language.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column language.last_update
     *
     * @return the value of language.last_update
     *
     * @mbggenerated
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column language.last_update
     *
     * @param lastUpdate the value for language.last_update
     *
     * @mbggenerated
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}