package edu.employment.issueTracker.mapper;

import edu.employment.issueTracker.model.entity.Issue;
import edu.employment.issueTracker.model.entity.Status;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IssueMapper {

    @Insert("INSERT INTO issue (id, name, author, description, issue_date, status_id) " +
            "VALUES (null, #{name}, #{author}, #{description}, #{date}, #{status.getId()}")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int create(Issue issue);


    @Results(id = "IssueDataResult", value = {
        @Result(property = "status", column = "status_id", javaType = Status.class,
                one = @One(select = "edu.employment.issueTracker.mapper.StatusMapper.get"))})
    @Select("SELECT * FROM issue WHERE id = #{id}")
    Issue get(long id);

    @ResultMap("IssueDataResult")
    @Select("SELECT * FROM issue")
    List<Issue> getAll();
}
