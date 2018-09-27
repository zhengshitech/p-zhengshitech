package tech.zhengshi.domain;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author H
 */
public abstract class BaseDomain {

    @ApiModelProperty(value = "主键", allowEmptyValue = true)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
