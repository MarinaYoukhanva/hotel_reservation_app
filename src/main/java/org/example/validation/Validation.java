package org.example.validation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.example.base.model.BaseEntity;
import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;

import java.io.Serializable;
import java.util.Set;

public class Validation<ID extends Serializable,T extends BaseEntity<ID>> {

    public Set<ConstraintViolation<T>> checkValidations(T entity) {
        try (ValidatorFactory factory = jakarta.validation.Validation.byDefaultProvider()
                .configure()
                .messageInterpolator(new ParameterMessageInterpolator())
                .buildValidatorFactory()) {
            Validator validator = factory.getValidator();
            return validator.validate(entity);
        }
    }
}
