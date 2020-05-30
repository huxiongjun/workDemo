package com.vsofo.inventory.mapper;

import com.vsofo.inventory.pojo.PigsArchive;

import java.util.List;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/10 0:01
 * @description mapper 接口
 */
public interface InventoryMapper {
    /**
     * 查询所有猪只
     *
     * @return User
     */
    List<PigsArchive> findAll();
}
