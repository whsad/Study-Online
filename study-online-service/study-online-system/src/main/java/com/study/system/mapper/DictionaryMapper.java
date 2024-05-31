package com.study.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.model.system.po.Dictionary;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DictionaryMapper extends BaseMapper<Dictionary> {
}
