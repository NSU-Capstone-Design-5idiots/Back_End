package com.codingrecipe.member.dto.product;

import com.codingrecipe.member.entity.enums.Category;
import com.codingrecipe.member.entity.ProductEntity;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ProductDetail {    // 상품 상세페이지를 위한 DTO

    private String productName;
    private String uploadTime;
    private int productPrice;
    private String productURL;
    private int productInven;
    private int productView;
    private String userName;
    private Category category;

    public ProductDetail(ProductEntity productEntity) {
        this.productName = productEntity.getProductName();
        this.uploadTime = productEntity.getUploadTime();
        this.productPrice = productEntity.getProductPrice();
        this.productURL = productEntity.getProductURL();
        this.productInven = productEntity.getProductInven();
        this.productView = productEntity.getProductView();
        this.category = productEntity.getCategory();
    }

}
