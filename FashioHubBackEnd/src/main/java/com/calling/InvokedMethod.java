package com.calling;

import com.Dao.UserDao;
import com.Daoimpl.UserDaoimpl;
import com.Model.User;

public class InvokedMethod {

	public static void main(String[] args) {
		UserDao u=new UserDaoimpl();
		for(User u1:u.getAllUser())
		{
			System.out.println("user name "+u1.getName());
			
		}
	}

}
