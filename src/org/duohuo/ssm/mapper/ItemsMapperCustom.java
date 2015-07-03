package org.duohuo.ssm.mapper;

import org.duohuo.ssm.po.Items;
import org.duohuo.ssm.po.ItemsCustom;
import org.duohuo.ssm.po.ItemsExample;
import org.duohuo.ssm.po.ItemsQueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemsMapperCustom {
    //商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}