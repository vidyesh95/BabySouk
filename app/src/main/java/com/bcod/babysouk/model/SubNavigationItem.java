package com.bcod.babysouk.model;

public class SubNavigationItem {

    private int subText;
    private boolean isSubExpandable;
    private boolean isSubLayoutExpanded;

    public SubNavigationItem(int subText, boolean isSubExpandable) {
        this.subText = subText;
        this.isSubExpandable = isSubExpandable;
        this.isSubLayoutExpanded = false;
    }

    public int getSubText() {
        return subText;
    }

    public void setSubText(int subText) {
        this.subText = subText;
    }

    public boolean isSubExpandable() {
        return isSubExpandable;
    }

    public void setSubExpandable(boolean subExpandable) {
        isSubExpandable = subExpandable;
    }

    public boolean isSubLayoutExpanded() {
        return isSubLayoutExpanded;
    }

    public void setSubLayoutExpanded(boolean subLayoutExpanded) {
        isSubLayoutExpanded = subLayoutExpanded;
    }
}
