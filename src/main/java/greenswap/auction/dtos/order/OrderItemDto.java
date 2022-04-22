package greenswap.auction.dtos.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class OrderItemDto {

    @NotNull
    private Integer orderId;

    @NotNull
    private Integer productId;

    @NotNull
    private Double price;

    @NotNull
    private Integer quantity;

}
