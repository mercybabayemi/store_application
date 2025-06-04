package org.estore.estore.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Setter
@Getter
public class AddProductResponse {
    private BigDecimal price;
    private String name;
    private String description;
    private Set<String> media;
}
