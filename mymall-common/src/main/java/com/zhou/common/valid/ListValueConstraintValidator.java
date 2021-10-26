package com.zhou.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * <ListValue, Integer>
 *   指定注解   指定要校验数据的类型
 */
public class ListValueConstraintValidator implements ConstraintValidator<ListValue, Integer> {

    private Set<Integer> set = new HashSet();
    //初始化方法

    public void initialize(ListValue constraintAnnotation) {

        int[] vals = constraintAnnotation.vals();
        for (int val : vals) {
            set.add(val);
        }
    }

    //判断是否校验成功
    /**
     * @param value 需要校验的值
     * @param context
     * @return
     */

    public boolean isValid(Integer value, ConstraintValidatorContext context) {

        return set.contains(value);
    }
}
