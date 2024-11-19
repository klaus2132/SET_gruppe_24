package models;

import javax.swing.*;
import java.util.ArrayList;

public class UnitListModel extends AbstractListModel<Unit> {
    private ArrayList<Unit> unitList;

    public UnitListModel(ArrayList<Unit> unitList) {
        this.unitList = unitList;
    }

    @Override
    public int getSize() {
        return unitList.size();
    }

    @Override
    public Unit getElementAt(int index) {
        return unitList.get(index);
    }

    // metode for å oppdatere listen
    public void updateList(ArrayList<Unit> newList) {
        unitList = newList;
        fireContentsChanged(this, 0, getSize() - 1);
    }
}
