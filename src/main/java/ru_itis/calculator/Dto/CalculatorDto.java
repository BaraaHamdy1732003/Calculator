package ru_itis.calculator.Dto;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru_itis.calculator.Models.CalculationHistory;
import ru_itis.calculator.Models.User;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CalculatorDto {
    private Long id;
    private Double firstNumber;
    private String operator;
    private Double secondNumber;
    private User currentUser;

    public static CalculatorDto from(CalculationHistory calculator) {
        return CalculatorDto.builder()
                .id(calculator.getId())
                .firstNumber(calculator.getFirstNumber())
                .operator(calculator.getOperator())
                .secondNumber(calculator.getSecondNumber())
                .currentUser(calculator.getUser())
                .build();
    }

    public static List<CalculatorDto> calculationHistoryList(List<CalculationHistory> calculations) {
        return calculations.stream()
                .map(CalculatorDto::from)
                .collect(Collectors.toList());

    }

}
