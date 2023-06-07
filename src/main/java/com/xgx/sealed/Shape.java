package com.xgx.sealed;

/**
 * @author xgx
 */
abstract sealed class Shape
    permits Circle, Rectangle, Square {}