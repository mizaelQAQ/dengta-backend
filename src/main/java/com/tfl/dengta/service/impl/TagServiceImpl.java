package com.tfl.dengta.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.tfl.dengta.mapper.TagMapper;
import com.tfl.dengta.model.domain.Tag;
import com.tfl.dengta.service.TagService;
import org.springframework.stereotype.Service;

/**
* @author u
* @description 针对表【tag(标签)】的数据库操作Service实现
* @createDate 2024-04-16 18:19:47
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService {

}




