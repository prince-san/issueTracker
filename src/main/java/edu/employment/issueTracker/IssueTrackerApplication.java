package edu.employment.issueTracker;

import edu.employment.issueTracker.model.entity.Issue;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes({Issue.class})
@MapperScan("edu.employment.issueTracker.model.mapper")
@SpringBootApplication
public class IssueTrackerApplication{

	public static void main(String[] args) {
		SpringApplication.run(IssueTrackerApplication.class, args);
	}
}