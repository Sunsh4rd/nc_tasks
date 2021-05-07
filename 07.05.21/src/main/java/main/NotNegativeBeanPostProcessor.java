package main;

import main.NotNegative;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class NotNegativeBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

            try {
                Field[] fields = bean.getClass().getDeclaredFields();
                for (Field field: fields) {
                    field.setAccessible(true);
                    if (field.isAnnotationPresent(NotNegative.class) && field.getFloat(bean) < 0) {
                        return new Rating(Math.abs(field.getFloat(bean)));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
