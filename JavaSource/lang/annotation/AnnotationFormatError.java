/*
 * Copyright (c) 2004, 2008, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package java.lang.annotation;

/**
 * Thrown when the annotation parser attempts to read an annotation
 * from a class file and determines that the annotation is malformed.
 * This error can be thrown by the {@linkplain
 * java.lang.reflect.AnnotatedElement API used to read annotations
 * reflectively}.
 *
 * 异常  错误定义的一般套路
 *
 * @author  Josh Bloch
 * @see     java.lang.reflect.AnnotatedElement
 * @since   1.5
 */
public class AnnotationFormatError extends Error {
    private static final long serialVersionUID = -4256701562333669892L;

    /**
     * Constructs a new <tt>AnnotationFormatError</tt> with the specified
     * detail message.
     *
     * @param   message   the detail message.
     */
    public AnnotationFormatError(String message) {
        super(message);
    }

    /**
     * Constructs a new <tt>AnnotationFormatError</tt> with the specified
     * detail message and cause.  Note that the detail message associated
     * with <code>cause</code> is <i>not</i> automatically incorporated in
     * this error's detail message.
     *
     * @param  message the detail message
     * @param  cause the cause (A <tt>null</tt> value is permitted, and
     *     indicates that the cause is nonexistent or unknown.)
     */
    public AnnotationFormatError(String message, Throwable cause) {
        super(message, cause);
    }


    /**
     * Constructs a new <tt>AnnotationFormatError</tt> with the specified
     * cause and a detail message of
     * <tt>(cause == null ? null : cause.toString())</tt> (which
     * typically contains the class and detail message of <tt>cause</tt>).
     *
     * @param  cause the cause (A <tt>null</tt> value is permitted, and
     *     indicates that the cause is nonexistent or unknown.)
     */
    public AnnotationFormatError(Throwable cause) {
        super(cause);
    }
}
