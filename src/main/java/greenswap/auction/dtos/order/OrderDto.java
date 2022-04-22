package greenswap.auction.dtos.order;

import greenswap.auction.entities.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class OrderDto {

    private Integer id;

    @NotNull
    private Integer userId;


    // constructor for order entity to dto mapping
    public OrderDto(Order order) {
        this.setId(order.getId());
        this.setUserId(order.getUser().getId());
    }
}
