package com.wj.persistence;

import com.wj.domain.Index_TableDTO;
import com.wj.domain.UserInfoDTO;

public interface Index_TableDAO {

	public String tableIndex(Index_TableDTO dto) throws Exception;
	public void indexInc(UserInfoDTO dto) throws Exception;
	public void indexSecInc(UserInfoDTO secondIndex)throws Exception;

}
