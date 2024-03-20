package ra.session13springmvc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Dao {
    private Integer id;
    private String name;
    private double height, weight;
    private Date birthday;
    private double price;
}
