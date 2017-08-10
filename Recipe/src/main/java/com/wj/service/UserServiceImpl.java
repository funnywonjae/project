package com.wj.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.wj.domain.Index_TableDTO;
import com.wj.domain.UserInfoDTO;
import com.wj.persistence.Index_TableDAO;
import com.wj.persistence.UserDAO;

@Service
public class UserServiceImpl implements UserService{

	@Inject 
	UserDAO dao;
	@Inject
	Index_TableDAO IndexDao;
	
	@Override
	public int checkUserIdWithPwd(UserInfoDTO dto) throws Exception{
	
		return dao.userCheck(dto);
		
	}
	
	@Override
	public void signup(UserInfoDTO dto) throws Exception {
		Index_TableDTO indexDTO = new Index_TableDTO();
		indexDTO.setCategory("userinfo");
		
		dto.setUsr_index(getTableIndex(indexDTO));

		try{
			dao.regist(dto);
			//usr_index 의 값을 인트형으로 변환하면서 +1 한후 16진수로 변환하여 dto에 넣는다.
			System.out.println("변환전"+dto.getUsr_index());


			String secondIndex = dto.getUsr_index().substring(4,8);
			String count_NumIndex = dto.getUsr_index().substring(8,16);
			
			System.out.println(secondIndex);
			System.out.println(count_NumIndex);
			
			
			if(!count_NumIndex.equals("ffffffff")){
				dto.setUsr_index(Long.toHexString(Long.parseLong(dto.getUsr_index(),16)+1));
				System.out.println("변환후" +dto.getUsr_index());
				IndexDao.indexInc(dto);
			}
			else{
				if(!secondIndex.equals("ffff")){
				dto.setUsr_index(Long.toHexString(Long.parseLong(secondIndex,16)+1));
				IndexDao.indexSecInc(dto);
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
			
		
		
	}
	
	@Override
	public String getTableIndex(Index_TableDTO dto) throws Exception {
		System.out.println("AA"+dto.getCategory());
		return IndexDao.tableIndex(dto);
		
	}

}
