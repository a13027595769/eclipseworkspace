package com.spring_jdbc.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
	private Long id;
	private String name;
	private int age;
}
