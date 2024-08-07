package com.example.ecommerce_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

import java.util.List;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrder
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Defines a many-to-one relationship between the Order and User entities.
    // An order is placed by a single user, but a user can place multiple orders.
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

 //A list of products included in the order. This field-
 // combined with the @ManyToMany annotation, indicates that the relationship is many-to-many.
 //In this case, it's used to indicate that an order can contain multiple products and a product can be part of multiple orders.
 @ManyToMany
 //name: This specifies the name of the join table.
 // In this example, the join table is named order_products.
 @JoinTable(name = "order_products",
         //joinColumns: This specifies the foreign key column in the join table that refers to the primary key of the current entity (in this case, the Order entity).
         //
         //@JoinColumn(name = "order_id"):
         // This specifies that the join column in the join table will be named order_id, and it will reference the primary key of the Order entity.
         joinColumns = @JoinColumn(name = "order_id"),
         //inverseJoinColumns: This specifies the foreign key column in the join table that refers to the primary key of the other entity (in this case, the Product entity).
         inverseJoinColumns = @JoinColumn(name = "product_id"))

 private List<Product> products;
    private double total;


}
