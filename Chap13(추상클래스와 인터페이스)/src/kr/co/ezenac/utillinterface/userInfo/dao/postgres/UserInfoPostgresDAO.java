package kr.co.ezenac.utillinterface.userInfo.dao.postgres;

import kr.co.ezenac.utillinterface.userInfo.UserInfoDTO;
import kr.co.ezenac.utillinterface.userInfo.dao.UserInfoDAO;

public class UserInfoPostgresDAO implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into Postgres DB userId = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into Postgres DB userId = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into Postgres DB userId = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into Postgres DB userId = " + userInfoDTO.getUserId());
		
	}

}
