package kr.co.ezenac.utillinterface.userInfo.dao;

import kr.co.ezenac.utillinterface.userInfo.UserInfoDTO;

public interface UserInfoDAO {
	
	void insertUserInfo(UserInfoDTO userInfoDTO);
	void selectUserInfo(UserInfoDTO userInfoDTO);
	void updateUserInfo(UserInfoDTO userInfoDTO);
	void deleteUserInfo(UserInfoDTO userInfoDTO);
	
}
