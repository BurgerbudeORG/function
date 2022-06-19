/*
 * Copyright (c) 2022 BurgerbudeORG <https://burgerbude.org/>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.burgerbude.libraries.function.test;

import org.burgerbude.libraries.function.Consumers;
import org.burgerbude.libraries.function.TriConsumer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

    @Test
    void canConsumeTest() {
        Consumer<Object> test = value -> {
        };

        Assertions.assertTrue(Consumers.canConsume(test, "Hello"));
        Assertions.assertFalse(Consumers.canConsume(null, "Hello"));
    }

    @Test
    void canBiConsumeTest() {
        BiConsumer<Object, Object> test = (a, b) -> {
        };

        Assertions.assertTrue(Consumers.canBiConsume(test, "Hello", "World"));
        Assertions.assertFalse(Consumers.canBiConsume(null, "Hello", "World"));
    }


    @Test
    void canTriConsumeTest() {
        TriConsumer<Object, Object, Object> test = (a, b, c) -> {
        };

        Assertions.assertTrue(Consumers.canTriConsume(test, "Hello", "World", "!"));
        Assertions.assertFalse(Consumers.canTriConsume(null, "Hello", "World", "!"));
    }

    @Test
    void consumeTest() {
        Consumer<Object> consumer = value -> {
        };

        Assertions.assertDoesNotThrow(() -> Consumers.consume(consumer, "Hello"));
        Assertions.assertThrowsExactly(
                NullPointerException.class,
                () -> Consumers.consume(null, "Hello")
        );
    }

    @Test
    void biConsumeTest() {
        BiConsumer<Object, Object> consumer = (a, b) -> {
        };

        Assertions.assertDoesNotThrow(() -> Consumers.biConsume(consumer, "Hello", "World"));
        Assertions.assertThrowsExactly(
                NullPointerException.class,
                () -> Consumers.biConsume(null, "Hello", "World")
        );
    }

    @Test
    void triConsumeTest() {
        TriConsumer<Object, Object, Object> consumer = (a, b, c) -> {
        };

        Assertions.assertDoesNotThrow(() -> Consumers.triConsume(consumer, "Hello", "World", "!"));
        Assertions.assertThrowsExactly(
                NullPointerException.class,
                () -> Consumers.triConsume(null, "Hello", "World", "!")
        );
    }

}
