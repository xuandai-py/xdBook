package com.sha.springbootbookseller.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "purchase_history")
@Data
public class PurchaseHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "book_id", nullable = false)
    private Long bookId;

    @Column(name = "price", nullable = false)
    private Long price;

    @Column(name = "purchase_time", nullable = false)
    private LocalDateTime purchaseTime;
}
