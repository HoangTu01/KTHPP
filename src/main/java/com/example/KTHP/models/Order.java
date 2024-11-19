package com.example.KTHP.models;
import jakarta.persistence.*;

@Entity
@Table(name = "`Order`") // Bao tên bảng trong dấu backtick
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;         // ID đơn hàng
    private Long productId;  // ID của sản phẩm
    private int quantity;    // Số lượng sản phẩm

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{id=" + id + ", productId=" + productId + ", quantity=" + quantity + "}";
    }
}

