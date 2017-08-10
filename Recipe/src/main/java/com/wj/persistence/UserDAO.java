package com.wj.persistence;

import com.wj.domain.Index_TableDTO;
import com.wj.domain.UserInfoDTO;

public interface UserDAO {
	public int userCheck(UserInfoDTO dto) throws Exception;
	public void regist(UserInfoDTO dto) throws Exception;
	
}
