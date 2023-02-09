package kr.co.ezenac.utillinterface.userInfo.dao.mysql;

import kr.co.ezenac.utillinterface.userInfo.UserInfoDTO;
import kr.co.ezenac.utillinterface.userInfo.dao.UserInfoDAO;

public class UserInfoMySqlDAO implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into MYSQL DB userId= " + userInfoDTO.getUserId());
		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into MYSQL DB userId= " + userInfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into MYSQL DB userId= " + userInfoDTO.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into MYSQL DB userId= " + userInfoDTO.getUserId());
		
	}

}
