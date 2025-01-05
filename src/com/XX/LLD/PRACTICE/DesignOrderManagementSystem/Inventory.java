package com.XX.LLD.PRACTICE.DesignOrderManagementSystem;

import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Product.Product;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Product.ProductCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Inventory {

    List<ProductCategory> productCategoryList;

//    CONSTRUCTOR INJECTION
    public Inventory(){
        productCategoryList = new ArrayList<>();
    }

    public List<ProductCategory> getProductCategoryList() {
        return productCategoryList;
    }

    //    ADD NEW PRODUCT-CATEGORY
    public void addCategory(int categoryID, String productName, int price){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setPrice(price);
        productCategory.setProductCategoryID(categoryID);
        productCategory.setCategoryName(productName);

        productCategoryList.add(productCategory);
    }

//    ADD PRODUCT TO THE
//    PARTICULAR CATEGORY
    public void addProduct(Product product, int productCategoryID){
        ProductCategory productCategory = null;
        for(ProductCategory pcl: productCategoryList){
            if(pcl.getProductCategoryID()==productCategoryID){
                productCategory = pcl;
            }
        }

        if(productCategory != null){
            productCategory.addProduct(product);
        }
    }

//    REMOVE PRODUCT FROM CATEGORY
    public void removeItems(Map<Integer, Integer> pMap){
        for(Map.Entry<Integer, Integer> entry:pMap.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
            ProductCategory productCategory = getProductCategoryFromID(entry.getKey());
            productCategory.removeProduct(entry.getValue());
        }
    }

    private ProductCategory getProductCategoryFromID(int produtCategoryID){
        for(ProductCategory pcl: productCategoryList){
            if(pcl.getProductCategoryID() == produtCategoryID){
                return pcl;
            }
        }
        return null;
    }
}
