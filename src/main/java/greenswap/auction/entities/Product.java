package greenswap.auction.entities;

import greenswap.auction.dtos.product.ProductDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Entity @Table(name = "products")
@Data @NoArgsConstructor @AllArgsConstructor
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "product_name")
    private String productName;

    @NotNull
    private String description;

    @NotNull
    private Integer quantity;

    @NotNull
    private Double price;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "date_created")
    private LocalDateTime dateCreated;

    @Column(name = "date_updated")
    private LocalDateTime dateUpdated;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;                                               // user, who put the product for sale (seller)

    @OneToOne(mappedBy = "product")
    private CartItem cartItem;


    // constructor for dto to product entity mapping
    public Product(ProductDto productDto, Category category) {
        this.productName = productDto.getProductName();
        this.description = productDto.getDescription();
        this.quantity = productDto.getQuantity();
        this.price = productDto.getPrice();
        this.imageUrl = productDto.getImageUrl();
        this.category = category;
        //this.dateCreated = productDto.getDateCreated();
        //this.dateUpdated = productDto.getDateUpdated();
    }

}
