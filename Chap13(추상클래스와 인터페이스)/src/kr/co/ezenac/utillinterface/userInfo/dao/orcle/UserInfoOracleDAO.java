package kr.co.ezenac.utillinterface.userInfo.dao.orcle;

import kr.co.ezenac.utillinterface.userInfo.UserInfoDTO;
import kr.co.ezenac.utillinterface.userInfo.dao.UserInfoDAO;

public class UserInfoOracleDAO implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into ORACLE DB userId= " + userInfoDTO.getUserId());
		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into ORACLE DB userId= " + userInfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into ORACLE DB userId= " + userInfoDTO.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into ORACLE DB userId= " + userInfoDTO.getUserId());
		
	}

}
