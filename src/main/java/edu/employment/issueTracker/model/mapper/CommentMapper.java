package edu.employment.issueTracker.model.mapper;

import edu.employment.issueTracker.model.entity.Comment;
import edu.employment.issueTracker.model.entity.Status;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CommentMapper {

    @Select("SELECT * FROM comment WHERE issue_id = ${id}")
    @Result(property = "status", javaType = Status.class, column = "status_id",
            one = @One(select = "edu.employment.issueTracker.model.mapper.StatusMapper.get"))
    List<Comment> getAllByIssueId(long id);

    @Insert("INSERT INTO comment (author, text, date, status_id, issue_id) VALUES (#{author}, #{text}, #{date}, " +
            "#{status.id}, #{issue.id})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int create(Comment comment);
}
