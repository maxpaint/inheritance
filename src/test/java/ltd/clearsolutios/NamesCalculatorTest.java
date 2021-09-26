package ltd.clearsolutios;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class NamesCalculatorTest {

    NamesCalculator calculator = new NamesCalculator().setNames(List.of("Mary","John", "Jennifer", "Michael","Mary"));

    @Test
    public void calculate_ifNameIsEmpty_return0() {
        Integer actualResult = calculator.calculate("");
        assertThat(actualResult).isEqualTo(0);
    }

    @Test
    public void calculate_ifNameIsNull_return0() {
        Integer actualResult = calculator.calculate(null);
        assertThat(actualResult).isEqualTo(0);
    }

    @Test
    public void calculate_ifNameMeetsTwice_return2() {
        Integer actualResult = calculator.calculate("Mary");
        assertThat(actualResult).isEqualTo(2);
    }

    @Test
    public void calculate_ifNameMeetsOnce_return1() {
        Integer actualResult = calculator.calculate("John");
        assertThat(actualResult).isEqualTo(1);
    }


    @Test
    public void count_nameInNames()
    {
        Integer actualResult = calculator.calculate("Mary");
        System.out.println(actualResult);
    }

}
