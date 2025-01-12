package com.example.storeHW.Controller;

import com.example.storeHW.Service.StoreService;
import com.example.storeHW.Service.StoreServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {

    private final StoreService storeService;


    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void addItemsInOrder(@RequestParam List<Integer> items) {
        storeService.storeAdd(items);
    }

    @GetMapping("/get")
    public List<Integer> getAllListItemsInOrder() {
        return storeService.storeGet();
    }
}