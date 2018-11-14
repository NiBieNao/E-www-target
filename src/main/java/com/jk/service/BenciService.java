package com.jk.service;

import java.util.List;

 
import com.jk.model.Benci;
import com.jk.model.Tree;

public interface BenciService {

	List<Benci> findBenci();
	
	List<Tree> queryTreeList(Tree tree);
}
