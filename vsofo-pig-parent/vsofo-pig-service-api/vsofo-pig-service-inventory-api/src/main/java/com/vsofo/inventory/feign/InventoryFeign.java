package com.vsofo.inventory.feign;

import com.vsofo.entity.Result;

import com.vsofo.inventory.feign.util.FeignConfig;
import com.vsofo.inventory.pojo.PigsArchive;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/12 16:20
 * @description 存栏feign
 */
@FeignClient(name = "pig-service-inventory", configuration = FeignConfig.class) // 定义降级的方法
// feign 调用 要用服务降级就不要在类上设置RequestMapping了
public interface InventoryFeign {
    @GetMapping(value = "/inventory/findAll")
    public Result<List<PigsArchive>> findAll();
}
