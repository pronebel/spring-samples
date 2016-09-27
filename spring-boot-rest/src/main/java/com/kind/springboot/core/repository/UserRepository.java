package com.kind.springboot.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kind.springboot.core.domain.UserDo;

/**
 * 
 * Function:用户数据访问. <br/>
 * Date:     2016年8月11日 下午12:51:16 <br/>
 * @author   weiguo.liu
 * @version  
 * @since    JDK 1.7
 * @see
 */
@Repository
public interface UserRepository extends CrudRepository<UserDo, Long> {
	/**
	 * 根据用户名获取用户.
	 * @param username
	 * @return
	 */
    public UserDo getByUsername(String username);
}
