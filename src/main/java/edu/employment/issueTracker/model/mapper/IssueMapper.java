package edu.employment.issueTracker.model.mapper;

import edu.employment.issueTracker.model.entity.Issue;
import edu.employment.issueTracker.model.entity.Status;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IssueMapper {

    @Insert("INSERT INTO issue (name, author, description, date, status_id) " +
            "VALUES (#{name}, #{author}, #{description}, #{date}, #{status.id})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int create(Issue issue);

    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "status", javaType = Status.class, column = "status_id",
                one = @One(select = "edu.employment.issueTracker.model.mapper.StatusMapper.get")),
        @Result(property = "comments", javaType = List.class, column = "id",
                many = @Many(select = "edu.employment.issueTracker.model.mapper.CommentMapper.getAllByIssueId"))})
    @Select("SELECT * FROM issue WHERE id = #{id}")
    Issue get(long id);

    @Result(property = "status", javaType = Status.class, column = "status_id",
            one = @One(select = "edu.employment.issueTracker.model.mapper.StatusMapper.get"))
    @Select("SELECT * FROM issue")
    List<Issue> getAll();

    @Update("UPDATE issue SET status_id = #{status.id} WHERE id = #{id}")
    void updateStatus(Issue issue);
}
