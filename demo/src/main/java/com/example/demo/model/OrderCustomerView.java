package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "order_customer_view")
@Getter
@Setter
@Immutable
public class OrderCustomerView {

    @Id
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "cutomer_name")
    private String cutomerName;

    @Column(name = "book_id")
    private Long bookId;

    @Column(name = "book_title")
    private String bookTitle;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "unit_price")  // 단가
    private Integer unitPrice;

    @Column(name = "total_price")
    private Integer totalPrice;



}
