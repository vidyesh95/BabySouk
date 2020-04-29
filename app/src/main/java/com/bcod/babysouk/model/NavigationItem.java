package com.bcod.babysouk.model;

public class NavigationItem {
    private int text;
    private boolean isExpandable;
    private boolean isLayoutExpanded;

    public NavigationItem(int text, boolean isExpandable) {
        this.text = text;
        this.isExpandable = isExpandable;
        this.isLayoutExpanded = false;
    }

    public int getText() {
        return text;
    }

    public void setText(int text) {
        this.text = text;
    }

    public boolean isExpandable() {
        return isExpandable;
    }

    public void setExpandable(boolean expandable) {
        isExpandable = expandable;
    }

    public boolean isLayoutExpanded() {
        return isLayoutExpanded;
    }

    public void setLayoutExpanded(boolean layoutExpanded) {
        isLayoutExpanded = layoutExpanded;
    }
}
