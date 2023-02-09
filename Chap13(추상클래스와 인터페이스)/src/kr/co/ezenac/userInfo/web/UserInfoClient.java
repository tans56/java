package kr.co.ezenac.userInfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import kr.co.ezenac.utillinterface.userInfo.UserInfoDTO;
import kr.co.ezenac.utillinterface.userInfo.dao.UserInfoDAO;
import kr.co.ezenac.utillinterface.userInfo.dao.mysql.UserInfoMySqlDAO;
import kr.co.ezenac.utillinterface.userInfo.dao.orcle.UserInfoOracleDAO;
import kr.co.ezenac.utillinterface.userInfo.dao.postgres.UserInfoPostgresDAO;

public class UserInfoClient {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfoDTO userInfoDTO = new UserInfoDTO();
		userInfoDTO.setUserId("ezen");
		userInfoDTO.setPasswd("0629");
		userInfoDTO.setUserName("이젠");
		
		UserInfoDAO userInfoDAO = null;
		if(dbType.equals("POSTGRES")) {
			userInfoDAO = new UserInfoPostgresDAO();
		}
		else if(dbType.equals("ORACLE")) {
			userInfoDAO = new UserInfoOracleDAO();
		}
		else if(dbType.equals("MYSQL")) {
			userInfoDAO = new UserInfoMySqlDAO();
		}
		else {
			System.out.println("db support error");
			return;
		}
		
		userInfoDAO.insertUserInfo(userInfoDTO);
		userInfoDAO.updateUserInfo(userInfoDTO);
		userInfoDAO.selectUserInfo(userInfoDTO);
		userInfoDAO.deleteUserInfo(userInfoDTO);
		
		
		
	}
}
