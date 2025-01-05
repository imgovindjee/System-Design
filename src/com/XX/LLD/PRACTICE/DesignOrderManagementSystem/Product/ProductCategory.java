package com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {

    int productCategoryID;
    String categoryName;
    List<Product> productList = new ArrayList<>();
    double price;

//    GETTER AND SETTER
    public int getProductCategoryID() {
        return productCategoryID;
    }

    public void setProductCategoryID(int productCategoryID) {
        this.productCategoryID = productCategoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


//    METHODS
    public void addProduct(Product product){
        productList.add(product);
    }

    public void removeProduct(int count){
        for(int i=1; i<=count; i++){
            productList.remove(0);
        }
    }

    public Product getProductByProductID(int pID){
        for(Product pl:productList){
            if(pl.productID == pID){
                return pl;
            }
        }
        return null;
    }

    public Product getProductByProductName(String pName){
        for (Product pl:productList){
            if(pl.productName.equals(pName)){
                return pl;
            }
        }
        return null;
    }
}
