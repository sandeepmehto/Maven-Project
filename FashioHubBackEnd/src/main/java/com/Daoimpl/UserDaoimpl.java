package com.Daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.Dao.UserDao;
import com.Model.User;

public class UserDaoimpl implements UserDao {
	User u1,u2;
	ArrayList<User> list;
	 public UserDaoimpl() {
		  list=new ArrayList<User>();
		 u1=new User("sandeep@gmail.com","sandeep","xyz","7503985262","87201977","india");
		 u2=new User("sandy@gmail.com","sandy","xyzkso","9874563210","369852014","australia");
		list.add(u1);
		list.add(u2);
	}



	

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return list;
	}
	
	
	
	

}
