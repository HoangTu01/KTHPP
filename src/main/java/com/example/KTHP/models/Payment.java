package com.example.KTHP.models;


import jakarta.persistence.*;

@Entity
@Table(name = "Payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;            // ID thanh toán
    private Long orderId;       // ID đơn hàng liên kết
    private double amount;       // Số tiền thanh toán
    private String paymentMethod; // Phương thức thanh toán (ví dụ: Credit Card, PayPal)
    private String status;       // Trạng thái thanh toán (Pending, Completed, Failed)

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Payment{id=" + id + ", orderId=" + orderId + ", amount=" + amount + ", paymentMethod='" + paymentMethod + "', status='" + status + "'}";
    }
}
