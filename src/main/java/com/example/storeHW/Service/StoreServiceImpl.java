package com.example.storeHW.Service;

import org.springframework.stereotype.Service;

import java.util.List;

import com.example.storeCase.dto.Order;
@Service
public class StoreServiceImpl implements StoreService {

    private Order order;

    @Override
    public void storeAdd(List<Integer> items) {
        items.forEach(order::add);
    }

    @Override
    public List<Integer> storeGet() {
        return order.getOrder();
    }
}