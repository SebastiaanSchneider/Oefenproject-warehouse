package org.bookstore.dtos;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bookstore.enums.OrderStatus;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * DTO for handling Order objects
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    @NotNull
    private UUID id;

    @NotNull
    private CustomerDTO customer;

    @NotNull
    @Valid
    private OrderStatus status;

    @NotNull
    private LocalDate createdAt;

    private List<OrderElementDTO> inventoryItems = new ArrayList<>();
}
