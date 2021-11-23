package edu.employment.issueTracker.mapper;

import edu.employment.issueTracker.model.entity.Status;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StatusMapper {

    @Select("SELECT * FROM status WHERE id = #{id}")
    Status get(long id);
}
