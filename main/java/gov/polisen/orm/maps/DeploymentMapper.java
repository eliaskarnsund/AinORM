package gov.polisen.orm.maps;

import gov.polisen.orm.clients.DeploymentSqlProvider;
import gov.polisen.orm.examples.DeploymentExample;
import gov.polisen.orm.models.Deployment;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

public interface DeploymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deployments
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    @SelectProvider(type=DeploymentSqlProvider.class, method="countByExample")
    int countByExample(DeploymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deployments
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    @Insert({
        "insert into deployments (author, modification_time, ",
        "first_revision, deletion_time, ",
        "status, priority, ",
        "longitude, latitude, description)",
        "values (#{author,jdbcType=INTEGER}, #{modificationTime,jdbcType=TIMESTAMP}, ",
        "#{firstRevision,jdbcType=INTEGER}, #{deletionTime,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=SMALLINT}, #{priority,jdbcType=SMALLINT}, ",
        "#{longitude,jdbcType=REAL}, #{latitude,jdbcType=REAL}, #{description,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insert(Deployment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deployments
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    @InsertProvider(type=DeploymentSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insertSelective(Deployment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deployments
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    @SelectProvider(type=DeploymentSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="author", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="modification_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="first_revision", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="deletion_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="status", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="priority", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="longitude", javaType=Float.class, jdbcType=JdbcType.REAL),
        @Arg(column="latitude", javaType=Float.class, jdbcType=JdbcType.REAL),
        @Arg(column="description", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Deployment> selectByExample(DeploymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deployments
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    @Select({
        "select",
        "id, author, modification_time, first_revision, deletion_time, status, priority, ",
        "longitude, latitude, description",
        "from deployments",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="author", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="modification_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="first_revision", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="deletion_time", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="status", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="priority", javaType=Short.class, jdbcType=JdbcType.SMALLINT),
        @Arg(column="longitude", javaType=Float.class, jdbcType=JdbcType.REAL),
        @Arg(column="latitude", javaType=Float.class, jdbcType=JdbcType.REAL),
        @Arg(column="description", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Deployment selectByPrimaryKey(Integer id);
}