package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform;

import java.time.Month;
import java.time.Year;

/**
 * record를 통해서 만든 객체는 불변 (수정할수가 없다) java 14부터 추가
 */
public record Reading(String customer, double quantity, Month month, Year year) {
}
