package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Maxim Bardakov (wizardofooz666@gmail.com)
 * @version $Id$
 * @since 25.08.18
 */
public class ConverterTest {
    /**
     * Test rubleToDollar.
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }
    /**
     * Test rubleToEuro.
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }
    /**
     * Test rubleToEuro.
     */
    @Test
    public void when1EuroToRubleThen70() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        assertThat(result, is(70));
    }
    /**
     * Test rubleToEuro.
     */
    @Test
    public void when1DollarToRubleThen60() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(1);
        assertThat(result, is(60));
    }

}