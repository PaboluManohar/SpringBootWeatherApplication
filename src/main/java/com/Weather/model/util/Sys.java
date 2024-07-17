package com.Weather.model.util;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Sys {
    private int type;
    private int id;
    private String country;
    private long sunrise;
    private long sunset;

}












//public int getType() {
//    return type;
//}
//
//public void setType(int type) {
//    this.type = type;
//}
//
//public int getId() {
//    return id;
//}