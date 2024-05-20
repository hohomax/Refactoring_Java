package me.whiteship.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.variation;

import java.util.List;

public class ChinaVoyageRating extends VoyageRating{

    private Voyage voyage;

    private List<VoyageHistory> history;

    public ChinaVoyageRating(Voyage voyage, List<VoyageHistory> history) {
        super(voyage, history);
    }

    @Override
    protected int captainHistoryRisk() {
        int result = 0;

        if (this.hasChinaHistory()) result -= 2;

        return Math.max(result, 0);
    }

    private int voyageRisk() {
        int result = 1;
        if (this.voyage.length() > 4) result += 2;
        if (this.voyage.length() > 8) result += this.voyage.length() - 8;
        if (List.of("china", "east-indies").contains(this.voyage.zone())) result += 4;
        return Math.max(result, 0);
    }

    @Override
    protected int voyageProfitFactor() {
        int result = 0;

        if (this.voyage.zone().equals("china")) result += 1;
        if (this.voyage.zone().equals("china") && this.hasChinaHistory()) {
            result += 3;
            if (this.history.size() > 10) result += 1;
            if (this.voyage.length() > 12) result += 1;
            if (this.voyage.length() > 18) result -= 1;
        }

        return result;
    }

    private boolean hasChinaHistory() {

        return this.history.stream().anyMatch(v -> v.zone().equals("china"));
    }


}
