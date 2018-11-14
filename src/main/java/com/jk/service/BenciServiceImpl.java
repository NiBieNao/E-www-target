package com.jk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jk.mapper.BenciMapper;
import com.jk.model.Benci;
import com.jk.model.Tree;

public class BenciServiceImpl implements BenciService {

	@Autowired
	private BenciMapper benciMapper;

	@Override
	public List<Benci> findBenci() {
	 
		return benciMapper.findBenci();
	}

	@Override
	public List<Tree> queryTreeList(Tree tree) {
		return benciMapper.queryTreeList(tree);

        }
}