package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.model.PurchaseHistory;
import com.sha.springbootbookseller.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {

    public PurchaseHistory savePurchase(PurchaseHistory purchaseHistory);

    public void deletePurchaseHistory(Long id);

    public List<IPurchaseItem> findPurchaseItem(Long userID);
}
