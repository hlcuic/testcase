package com.hlcui.dao;

import com.hlcui.model.TraderVo;

public interface Datamapper {
	public abstract TraderVo findById(int id);
	public abstract int insert(TraderVo vo);
}
