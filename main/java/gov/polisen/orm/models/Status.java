package gov.polisen.orm.models;

public class Status {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statuses.id
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    private Short id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statuses.shorthand
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    private String shorthand;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statuses.description
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statuses
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public Status(Short id, String shorthand, String description) {
        this.id = id;
        this.shorthand = shorthand;
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statuses.id
     *
     * @return the value of statuses.id
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public Short getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statuses.shorthand
     *
     * @return the value of statuses.shorthand
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public String getShorthand() {
        return shorthand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statuses.description
     *
     * @return the value of statuses.description
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public String getDescription() {
        return description;
    }
}