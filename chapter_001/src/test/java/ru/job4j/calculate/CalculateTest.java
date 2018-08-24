package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Maxim Bardakov (wizardofooz666@gmail.com)
* @version $Id$
* @since 24.08.18
*/
public class CalculateTest {
/**
* Test echo.
*/
@Test
public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Petr Arsentev";
    String expect = "Echo, echo, echo : Petr Arsentev"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
    }
 
}