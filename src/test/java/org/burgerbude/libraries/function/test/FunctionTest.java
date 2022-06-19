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

import org.burgerbude.libraries.function.Functions;
import org.burgerbude.libraries.function.TriFunction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {

    @Test
    void nullSafetyFunctionTest() {
        Function<Object, Object> nullFunction = null;
        Function<Object, Object> contentFunction = (a) -> "Hello";

        Assertions.assertThrowsExactly(NullPointerException.class, () -> nullFunction.apply("World"));
        Assertions.assertDoesNotThrow(() -> Functions.apply(nullFunction, "World"));

        Assertions.assertDoesNotThrow(() -> Functions.apply(contentFunction, "World"));

        Assertions.assertNotNull(contentFunction.apply("World"));

        Assertions.assertEquals("Hello", contentFunction.apply("World"));
    }

    @Test
    void nullSafetyBiFunctionTest() {
        BiFunction<Object, Object, Object> nullFunction = null;
        BiFunction<Object, Object, Object> contentFunction = (a, b) -> "Hello";

        Assertions.assertThrowsExactly(NullPointerException.class, () -> nullFunction.apply("World", "!"));
        Assertions.assertDoesNotThrow(() -> Functions.apply(nullFunction, "World", "!"));

        Assertions.assertDoesNotThrow(() -> Functions.apply(contentFunction, "World", "!"));

        Assertions.assertNotNull(contentFunction.apply("World", "!"));

        Assertions.assertEquals("Hello", contentFunction.apply("World", "!"));
    }

    @Test
    void nullSafetyTriFunctionTest() {
        TriFunction<Object, Object, Object, Object> nullFunction = null;
        TriFunction<Object, Object, Object, Object> contentFunction = (a, b, c) -> "Hello";

        Assertions.assertThrowsExactly(NullPointerException.class, () -> nullFunction.apply("World", "!", ""));
        Assertions.assertDoesNotThrow(() -> Functions.apply(nullFunction, "World", "!", ""));

        Assertions.assertDoesNotThrow(() -> Functions.apply(contentFunction, "World", "!", ""));

        Assertions.assertNotNull(contentFunction.apply("World", "!", ""));

        Assertions.assertEquals("Hello", contentFunction.apply("World", "!", ""));
    }
}
