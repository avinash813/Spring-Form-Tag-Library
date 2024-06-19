package com.sample.model;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Employee {
	    private Integer id=5;
	    private String iname;
	    private String icity;
	    private Double isalary;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getIname() {
			return iname;
		}
		public void setIname(String iname) {
			this.iname = iname;
		}
		public String getIcity() {
			return icity;
		}
		public void setIcity(String icity) {
			this.icity = icity;
		}
		public Double getIsalary() {
			return isalary;
		}
		public void setIsalary(Double isalary) {
			this.isalary = isalary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", iname=" + iname + ", icity=" + icity + ", isalary=" + isalary + "]";
		}
	    
	    
}
