package com.ccjjltx.dao;

import com.ccjjltx.model.Einformation;

public interface EinformationMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Einformation record);

    int insertSelective(Einformation record);

    Einformation selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Einformation record);

    int updateByPrimaryKey(Einformation record);
}