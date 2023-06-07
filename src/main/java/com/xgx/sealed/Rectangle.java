package com.xgx.sealed;

/**
 * @author xgx
 * @Description: 允许的子类可以再次被声明为密封类（sealed），这样允许的子类可以以一种受限制的方式进一步扩展。
 */
sealed class Rectangle extends Shape
        permits TransparentRectangle, FilledRectangle {}
