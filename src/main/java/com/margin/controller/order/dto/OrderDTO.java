package com.margin.controller.order.dto;

import com.margin.common.enums.PaymentType;
import com.margin.controller.orderproduct.dto.OrderProductDTO;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class OrderDTO {

    private Long id;

    private List<OrderProductDTO> orderProducts;

    private Long customerId;

    private Long shopId;

    private Long addressId;

    private BigDecimal originalPrice;

    private BigDecimal totalPrice;

    private BigDecimal paidFromBonus;

    private PaymentType paymentType;

    private BigDecimal orderDiscount;
}
