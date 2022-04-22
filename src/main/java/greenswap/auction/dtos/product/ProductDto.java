package greenswap.auction.dtos.product;

import greenswap.auction.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ProductDto {

    private Integer id;

    @NotNull
    private String productName;

    @NotNull
    private String description;

    @NotNull
    private Integer quantity;

    @NotNull
    private Double price;

    @NotNull
    private Integer categoryId;

    @NotNull
    private Integer userId;

    @NotNull
    private String imageUrl;

    //private LocalDateTime dateCreated;
    //private LocalDateTime dateUpdated;


    // constructor for product entity to dto mapping
    public ProductDto(Product product) {
        this.setId(product.getId());
        this.setProductName(product.getProductName());
        this.setDescription(product.getDescription());
        this.setQuantity(product.getQuantity());
        this.setPrice(product.getPrice());
        this.setCategoryId(product.getCategory().getId());
        this.setUserId(product.getUser().getId());
        this.setImageUrl(product.getImageUrl());
        //this.setDateCreated(product.getDateCreated());
        //this.setDateUpdated(product.getDateUpdated());
    }

}
