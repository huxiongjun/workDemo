package com.vsofo.inventory.service;

import com.vsofo.inventory.pojo.PigsArchive;

import java.util.List;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/10 0:02
 * @description User接口
 */
public interface InventoryService {
    // 查询所有猪只
    List<PigsArchive> findAll();
}
