package com.wms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 小林ikun
 * @since 2024-11-08
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    IPage<User> pageC(Page<User> page);

    IPage<User> pageCc(Page<User> page, @Param(Constants.WRAPPER) Wrapper wrapper);
}
