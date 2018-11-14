package com.jk.mapper;

import java.util.List;

import com.jk.model.Benci;
import com.jk.model.Tree;

public interface BenciMapper {

	List<Benci> findBenci();

	List<Tree> queryTreeList(Tree tree);

}
