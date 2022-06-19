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

/**
 * Represents an operation that accepts three arguments and returns no result.
 *
 * @param <A> The type of the first argument to the operation.
 * @param <B> The type of the second argument to the operation.
 * @param <C> The type of the third argument to the operation.
 */
@FunctionalInterface
public interface ThrowableTriConsumer<A, B, C> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @throws Throwable If an error occurs.
     */
    void accept(A a, B b, C c) throws Throwable;

    /**
     * Returns a composed {@link ThrowableTriConsumer} that performs, in sequence, this operation followed by the after
     * operation. If performing either operation throws an exception, it is relayed to the caller of the composed
     * operation. If performing this operation throws an exception, the after operation will not be performed.
     *
     * @param after The operation to perform after this operation.
     * @return A composed {@link ThrowableTriConsumer} that performs in sequence this operation followed by the after operation.
     * @throws NullPointerException If {@code after} is {@code null}
     */
    default ThrowableTriConsumer<A, B, C> andThen(ThrowableTriConsumer<? super A, ? super B, ? super C> after) {
        Objects.requireNonNull(after);
        return (a, b, c) -> {
            this.accept(a, b, c);
            after.accept(a, b, c);
        };
    }
}
