package greenswap.auction.dtos.cart;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;


@Getter @Setter @NoArgsConstructor @ToString
public class AddToCartDto {

    private Integer id;

    @NotNull
    private Integer productId;

    @NotNull
    private Integer quantity;

}
