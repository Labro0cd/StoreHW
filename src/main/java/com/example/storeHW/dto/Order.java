package com.example.storeCase.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Order {

    private List<Integer> order;

    public Order(List<Integer> order) {
        this.order = order;
    }

    public void add(Integer item) {
        order.add(item);
    }

    public List<Integer> getOrder() {
        return order;
    }

    public void setOrder(List<Integer> order) {
        this.order = order;
    }
}