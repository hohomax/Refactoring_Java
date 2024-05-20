package me.whiteship.refactoring._06_mutable_data._21_replace_derived_variable_with_query;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * applyAdjustment 메소드에서 2개의 변수를 관리하던 부분을
 * 별도 getProduction 메소드로 stream sum을 이용하여 별도 처리하도록 분리
 */

public class ProductionPlan_rf {
    private List<Double> adjustments = new ArrayList<>();

    public void applyAdjustment(double adjustment) {

        this.adjustments.add(adjustment);
    }

    public double getProduction() {
        return adjustments.stream().mapToDouble(Double::doubleValue).sum();
    }
}
