package com.hlcui.dao;

import java.util.List;

import com.hlcui.model.TraderVo;

public interface Datamapper {
	public abstract TraderVo findById(int id);
	public abstract int insert(TraderVo vo);
	public abstract void batchInsert(List<TraderVo> list);
}
