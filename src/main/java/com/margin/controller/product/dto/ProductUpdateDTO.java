package com.margin.controller.product.dto;

import com.margin.common.enums.Unit;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class ProductUpdateDTO {

    private Long id;

    private String name;

    private String description;

    private Boolean active;

    private Boolean visible;

    private BigDecimal price;

    private Unit unit;

    private Long shopId;
}
