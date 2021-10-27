package eda.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coupon_admin {
    private int cu_id;
    private String cu_name;
    private  int cu_quota;
    private int cu_minmoney;
    private int cu_status;
}
