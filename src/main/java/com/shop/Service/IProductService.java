package com.shop.Service;

import com.shop.common.ServerResponse;
import com.shop.pojo.Product;

public interface IProductService {
    ServerResponse saveOrUpdateProduct(Product product);
    ServerResponse<String> setSaleStatus(Integer productId, Integer status);
}
