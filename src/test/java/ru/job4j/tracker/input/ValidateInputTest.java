package ru.job4j.tracker.input;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;

import static org.assertj.core.api.Assertions.*;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"2"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(2);
    }

    @Test
    void when234ValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"2", "3", "4"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected1 = input.askInt("Enter menu:");
        assertThat(selected1).isEqualTo(2);
        int selected2 = input.askInt("Enter menu:");
        assertThat(selected2).isEqualTo(3);
        int selected3 = input.askInt("Enter menu:");
        assertThat(selected3).isEqualTo(4);
    }

    @Test
    void whenMinus1Input() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }
}