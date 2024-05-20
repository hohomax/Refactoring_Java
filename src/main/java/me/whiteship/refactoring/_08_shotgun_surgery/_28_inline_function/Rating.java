package me.whiteship.refactoring._08_shotgun_surgery._28_inline_function;


/**
 * 인라인 메소드를 통해 분리되어있는 로직을 하나의 라인에 합치기
 */
public class Rating {

    /**  변경 전 소스
     *   public int rating(Driver driver) {
     *         return moreThanFiveLateDeliveries(driver) ? 2 : 1;
     *     }
     *
     *     private boolean moreThanFiveLateDeliveries(Driver driver) {
     *         return driver.getNumberOfLateDeliveries() > 5;
     *     }
     * }
     */

    public int rating(Driver driver) {

        return driver.getNumberOfLateDeliveries() > 5 ? 2 : 1;
    }



}
