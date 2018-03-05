package com.zrf.struts2.bean;

import java.util.ArrayList;
import java.util.List;

public class Dao {
  public List<Department>getDepartments(){
	  List<Department>depts=new ArrayList<Department>();
	  depts.add(new Department(1001,"AAA"));
	  depts.add(new Department(1002,"BBB"));
	  depts.add(new Department(1003,"CCC"));
	  depts.add(new Department(1004,"DDD"));
	  depts.add(new Department(1005,"EEE"));
	  return depts;
  }
  public List<Role>getRoles(){
	  List<Role>roles=new ArrayList<Role>();
	  roles.add(new Role(2001,"XXX"));
	  roles.add(new Role(1001,"YYY"));
	  roles.add(new Role(1001,"ZZZ"));
	  return roles;
  }
}
