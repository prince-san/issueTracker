package edu.employment.issueTracker.model.mapper;

import edu.employment.issueTracker.model.entity.Status;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StatusMapper {

    @Select("SELECT * FROM status WHERE id = #{id}")
    Status get(long id);

    @Select("SELECT * FROM status WHERE name = #{name}")
    Status getByName(String name);

    @Select("SELECT * FROM status")
    List<Status> getAll();
}
