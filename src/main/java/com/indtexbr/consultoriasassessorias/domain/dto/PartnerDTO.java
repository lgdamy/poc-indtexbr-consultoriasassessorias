package com.indtexbr.consultoriasassessorias.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @author lgdamy@raiadrogasil.com on 22/02/2021
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PartnerDTO {


    @ApiModelProperty(example = "charlesfix")
    private String id;

    @NotNull
    @ApiModelProperty(example = "30.281.367/0001-91")
    private String document;

    @Digits(integer = 10, fraction = 2)
    @ApiModelProperty(example = "Charles Fix")
    private String name;

    @ApiModelProperty(example = "+5511950207776")
    private String contactPhone;

    @ApiModelProperty(example = "contato@charlesfix.com")
    private String contactEmail;

    @ApiModelProperty(example = "[1,10,25,58,109,201]", readOnly = true)
    private Set<Long> currentContracts;

}
