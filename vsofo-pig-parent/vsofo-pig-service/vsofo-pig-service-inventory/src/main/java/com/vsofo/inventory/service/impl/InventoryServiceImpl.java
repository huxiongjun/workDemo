package com.vsofo.inventory.service.impl;

import com.vsofo.inventory.mapper.InventoryMapper;
import com.vsofo.inventory.pojo.PigsArchive;
import com.vsofo.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/10 0:02
 * @description User 实现类
 */
@Service(value = "inventoryService")
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    private InventoryMapper inventoryMapper;// 此处报错不用理会

    @Override
    public List<PigsArchive> findAll() {
        return inventoryMapper.findAll();
    }
}
