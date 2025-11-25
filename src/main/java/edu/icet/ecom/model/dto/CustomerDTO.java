package edu.icet.ecom.model.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private String custName;
    private String custAddress;
    private String city;
    private String postalCode;
}
