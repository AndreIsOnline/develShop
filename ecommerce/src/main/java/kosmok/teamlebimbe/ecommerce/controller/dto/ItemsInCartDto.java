package kosmok.teamlebimbe.ecommerce.controller.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

public class ItemsInCartDto {

    private Long id;

    private Integer count;

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
