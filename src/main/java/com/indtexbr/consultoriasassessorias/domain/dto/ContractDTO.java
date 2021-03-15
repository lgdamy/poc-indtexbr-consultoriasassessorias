package com.indtexbr.consultoriasassessorias.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author lgdamy@raiadrogasil.com on 13/03/2021
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContractDTO {

    @ApiModelProperty(example = "10", readOnly = true)
    private Long id;

    @ApiModelProperty(example = "Presta\u00e7\u00e3o de servi\u00e7o de manuten\u00e7\u00e3o dos maquin\u00e1rios")
    private String description;

    @ApiModelProperty(example = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")
    private String openText;

    @ApiModelProperty(example = "5290.00")
    private BigDecimal yearlyPrice;

    @ApiModelProperty(example = "IGPM")
    private String financialBallast;

    private boolean automaticRenewal;

    @ApiModelProperty(example = "15/02/2021")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone = "GMT-3")
    private Date createdAt;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone = "GMT-3")
    @ApiModelProperty(example = "15/04/2021")
    private Date dueTo;

    @ApiModelProperty(example = "s3://indtexbr.com.br/assets/contrato-44.pdf")
    private String url;

    private CompanyDTO provider;

}
