package com.demo.mapper;

import com.demo.pojo.Dishes;

public interface DishesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dishes record);

    int insertSelective(Dishes record);

    Dishes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dishes record);

    int updateByPrimaryKey(Dishes record);
}