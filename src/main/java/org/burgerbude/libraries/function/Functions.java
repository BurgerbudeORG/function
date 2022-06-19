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
package org.burgerbude.libraries.function;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Helper class for {@link Function}, {@link BiFunction} and {@link TriFunction}.
 */
public final class Functions {

    /**
     * Null-safe call to {@link Function#apply(Object)}.
     *
     * @param function The function or {@code null}.
     * @param value    The function argument.
     * @param <T>      The type of the input to the function.
     * @param <R>      The type of hte result of the function.
     * @return The result of {@link Function#apply(Object)} or {@code null}.
     */
    public static <T, R> R apply(Function<T, R> function, T value) {
        return function == null ? null : function.apply(value);
    }

    /**
     * Null-safe call to {@link BiFunction#apply(Object, Object)}.
     *
     * @param function The function or {@code null}.
     * @param t        The first function argument.
     * @param u        The second function argument.
     * @param <T>      The type of the first input to the function.
     * @param <U>      The type of the second input to the function.
     * @param <R>      The type of hte result of the function.
     * @return The result of {@link BiFunction#apply(Object, Object)} or {@code null}.
     */
    public static <T, U, R> R apply(BiFunction<T, U, R> function, T t, U u) {
        return function == null ? null : function.apply(t, u);
    }

    /**
     * Null-safe call to {@link TriFunction#apply(Object, Object, Object)}.
     *
     * @param function The function or {@code null}.
     * @param a        The first function argument.
     * @param b        The second function argument.
     * @param c        The third function argument.
     * @param <A>      The type of the first input to the function.
     * @param <B>      The type of the second input to the function.
     * @param <C>      The type of the third input to the function.
     * @param <R>      The type of hte result of the function.
     * @return The result of {@link TriFunction#apply(Object, Object, Object)} or {@code null}.
     */
    public static <A, B, C, R> R apply(TriFunction<A, B, C, R> function, A a, B b, C c) {
        return function == null ? null : function.apply(a, b, c);
    }
}
