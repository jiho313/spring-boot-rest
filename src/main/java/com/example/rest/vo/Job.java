package com.example.rest.vo;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@Alias("Job")
@ToString
public class Job {

	private String id;
	private String title;
	private int minSalary;
	private int maxSalary;
}
