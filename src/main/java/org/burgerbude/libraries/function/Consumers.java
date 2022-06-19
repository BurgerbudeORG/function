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

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Helper class for {@link Consumer}, {@link BiConsumer} and {@link TriConsumer}
 */
public final class Consumers {

    /**
     * @param consumer The consumer.
     * @param value    The input argument.
     * @param <T>      The type of the input to the operation.
     * @throws NullPointerException If {@code consumer } is {@code null}.
     */
    public static <T> void consume(Consumer<T> consumer, T value) {
        Objects.requireNonNull(consumer);
        consumer.accept(value);
    }

    /**
     * @param consumer The consumer.
     * @param value    The input argument.
     * @param <T>      The type of the input to the operation.
     * @return {@code true} if the {@code consumer} is not null, otherwise {@code false}.
     */
    public static <T> boolean canConsume(Consumer<T> consumer, T value) {
        if (consumer == null) {
            return false;
        }
        consumer.accept(value);
        return true;
    }

    /**
     * @param consumer The consumer.
     * @param t        The first input argument.
     * @param u        The second input argument.
     * @param <T>      The type of the input to the operation.
     * @throws NullPointerException If {@code consumer } is {@code null}.
     */
    public static <T, U> void biConsume(BiConsumer<T, U> consumer, T t, U u) {
        Objects.requireNonNull(consumer);
        consumer.accept(t, u);
    }


    /**
     * @param consumer The consumer.
     * @param t        The first input argument.
     * @param u        The second input argument.
     * @param <T>      The type of the input to the operation.
     * @return {@code true} if the {@code consumer} is not null, otherwise {@code false}.
     */
    public static <T, U> boolean canBiConsume(BiConsumer<T, U> consumer, T t, U u) {
        if (consumer == null) {
            return false;
        }

        consumer.accept(t, u);
        return true;
    }

    /**
     * @param consumer The consumer.
     * @param a        The first input argument.
     * @param b        The second input argument.
     * @param c        The third input argument.
     * @param <A>      The type of the first input to the operation.
     * @param <B>      The type of the second input to the operation.
     * @param <C>      The type of the third input to the operation.
     * @throws NullPointerException If {@code consumer } is {@code null}.
     */
    public static <A, B, C> void triConsume(TriConsumer<A, B, C> consumer, A a, B b, C c) {
        Objects.requireNonNull(consumer);
        consumer.accept(a, b, c);
    }


    /**
     * @param consumer The consumer.
     * @param a        The first input argument.
     * @param b        The second input argument.
     * @param c        The third input argument.
     * @param <A>      The type of the first input to the operation.
     * @param <B>      The type of the second input to the operation.
     * @param <C>      The type of the third input to the operation.
     * @return {@code true} if the {@code consumer} is not null, otherwise {@code false}.
     */
    public static <A, B, C> boolean canTriConsume(TriConsumer<A, B, C> consumer, A a, B b, C c) {
        if (consumer == null) {
            return false;
        }

        consumer.accept(a, b, c);
        return true;
    }

}
