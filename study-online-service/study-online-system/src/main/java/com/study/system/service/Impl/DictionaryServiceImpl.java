package com.study.system.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.model.system.po.Dictionary;
import com.study.system.mapper.DictionaryMapper;
import com.study.system.service.DictionaryService;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl extends ServiceImpl<DictionaryMapper, Dictionary> implements DictionaryService {
}
