package com.login;

import android.provider.BaseColumns;

/**
 * Created by aaldaeej on 4/13/2016.
 */
public class ProductTableData {
    public ProductTableData() {}


    public static abstract class ProductTableInfo implements BaseColumns
    {
        public static final String NAME = "name";
        public static final String EMAIL = "email";
        public static final String PRODUCT_TYPE = "product_type";
        public static final String DESCRIPTION = "description";
        public static final String PRICE = "price";
        public static final String CONTACT = "contact";

        public static final String DATABASE_NAME = "product_info";
        public static final String TABLE_NAME = "product_item_info";

    }
}
