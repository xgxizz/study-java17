package com.xgx.sealed;


/**
 * @author xgx
 * @Description: 允许的子类可以声明为 final 以防止其在类层次结构中的一部分被进一步扩展（允许的子类无法再扩展）。 （Record类被隐式声明为最终类。）
 */
final class Circle extends Shape {
}
