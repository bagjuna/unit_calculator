package unit.calculator.Area.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
public class AreaConversionHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 입력한 값
    @Column(nullable = false)
    private BigDecimal inputValue;

    // 결과 값
    @Column(nullable = false)
    private BigDecimal convertedValue;

    // 변환 전 단위
    @Column(nullable = false)
    private String sourceUnit;

    // 변환 후 단위
    @Column(nullable = false)
    private String targetUnit;

    // 변환 시각
    @Column(nullable = false)
    private LocalDateTime convertedAt;


    public AreaConversionHistory(BigDecimal inputValue, BigDecimal convertedValue, String sourceUnit, String targetUnit) {
        this.inputValue = inputValue;
        this.convertedValue = convertedValue;
        this.sourceUnit = sourceUnit;
        this.targetUnit = targetUnit;
        this.convertedAt = LocalDateTime.now();
    }

}
