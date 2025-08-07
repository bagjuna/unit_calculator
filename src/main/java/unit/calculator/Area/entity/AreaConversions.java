package unit.calculator.Area.entity;

import static lombok.AccessLevel.*;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
public class AreaConversions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "area_unit_name")  // DB에서는 "area_unit_name"이지만, Java에서는 camelCase 사용
    private String areaUnitName;

    private BigDecimal areaUnitValue; // camelCase 유지

    public AreaConversions(String areaUnitName, BigDecimal areaUnitValue) {
        this.areaUnitName = areaUnitName;
        this.areaUnitValue = areaUnitValue;
    }


}
