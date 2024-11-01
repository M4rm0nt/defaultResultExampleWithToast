package com.example.result;

import com.example.result.defaultResult.DefaultResult;

public class OrderProcessOutput extends DefaultResult<OrderData> {
    private OrderData orderData;

    public OrderProcessOutput() {
        super();
        this.orderData = new OrderData();
    }

    public OrderData getOrderData() {
        return orderData;
    }

    public void setOrderData(OrderData orderData) {
        this.orderData = orderData;
    }
}
