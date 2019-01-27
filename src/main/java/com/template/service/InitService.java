package com.template.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.template.bean.Init;
import com.template.dao.InitMapper;

@Service
public class InitService {

	@Autowired
	InitMapper initMapper;

	// 按住键查询
	public Init selectByPrimaryKey(int id) {
		return initMapper.selectByPrimaryKey(id);
	}

	// 按主建修改
	public int updateByPrimaryKey(Init init) {
		return initMapper.updateByPrimaryKey(init);
	}

	// 添加数据
	public int insert(Init init) {
		return initMapper.insert(init);
	}

	// 按主键删除数据
	public int deleteByPrimaryKey(int id) {
		return initMapper.deleteByPrimaryKey(id);
	}
}
