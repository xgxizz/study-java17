package com.xgx.sealed;

/**
 * @author xgx
 * @Description: 允许的子类可以声明为非密封的（non-sealed），这样允许的子类可以任意的扩展（未知的子类也可以扩展）。密封类不能阻止其允许的子类声明为non-sealed。
 */
non-sealed class Square extends Shape {
}
