package com.zng.system.user.repository;

import com.zng.common.repository.InitRepository;
import com.zng.system.user.entity.SysRole;
import org.springframework.stereotype.Repository;

/**
 * Created by John.Zhang on 2017/12/26.
 */
@Repository
public interface SysRoleRepository extends InitRepository<SysRole,Long> {

}
