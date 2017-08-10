package com.wj.service;

import com.wj.domain.Index_TableDTO;
import com.wj.domain.UserInfoDTO;

public interface UserService {

public int checkUserIdWithPwd(UserInfoDTO dto) throws Exception;
public void signup(UserInfoDTO dto) throws Exception;
public String getTableIndex(Index_TableDTO dto) throws Exception;
}
