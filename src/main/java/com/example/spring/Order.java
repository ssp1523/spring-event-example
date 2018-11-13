package com.example.spring;

import java.time.LocalDateTime;

/**
 * 订单实体
 * @author: sunshaoping
 * @date: Create by in 17:57 2018-11-13
 */
public class Order {

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 订单状态
     */
    private String orderStatus;

    /**
     * 商品
     */
    private String goods;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }


    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNo='" + orderNo + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", goods='" + goods + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
