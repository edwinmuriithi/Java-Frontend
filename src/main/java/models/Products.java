package models;

import java.sql.Connection;
import java.util.List;

public class Products {


    public String name;
    public String price;
    public String units_available;
    public String category_id;
    public String product_id;
    public String business_id;

    public Products(String name, String price, String units_available, String category_id, String product_id, String business_id) {
        this.name = name;
        this.price = price;
        this.units_available = units_available;
        this.category_id = category_id;
        this.product_id = product_id;
        this.business_id = business_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUnits_available() {
        return units_available;
    }

    public void setUnits_available(String units_available) {
        this.units_available = units_available;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getBusiness_id() {
        return business_id;
    }

    public void setBusiness_id(String business_id) {
        this.business_id = business_id;
    }
//    public static List<Products> all() {
//        String sql = "SELECT * FROM products";
//        try (Connection con = Db.sql2o.open()) {
//            return con.createQuery(sql)
//                    .throwOnMappingFailure(false)
//                    .executeAndFetch(Products.class);
//        }
    }

