package com.example.storeHW.Service;

import java.util.List;

public interface StoreService {

    public void storeAdd(List<Integer> items);

    public List<Integer> storeGet();
}