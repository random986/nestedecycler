package com.realdynamite.nestedrecycler;

import java.util.List;

public class Section {
    private String sectionName;
    private List<String> sectionTitle;
    private  List<String> shortcut;
    private  List<String> shortcutDesc;

    public Section(String sectionName, List<String> sectionTitle, List<String> shortcut, List<String> shortcutDesc) {
        this.sectionName = sectionName;
        this.sectionTitle = sectionTitle;
        this.shortcut = shortcut;
        this.shortcutDesc = shortcutDesc;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public List<String> getSectionTitle() {
        return sectionTitle;
    }

    public void setSectionTitle(List<String> sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public List<String> getShortcut() {
        return shortcut;
    }

    public void setShortcut(List<String> shortcut) {
        this.shortcut = shortcut;
    }

    public List<String> getShortcutDesc() {
        return shortcutDesc;
    }

    public void setShortcutDesc(List<String> shortcutDesc) {
        this.shortcutDesc = shortcutDesc;
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionName='" + sectionName + '\'' +
                ", sectionTitle=" + sectionTitle +
                ", shortcut=" + shortcut +
                ", shortcutDesc=" + shortcutDesc +
                '}';
    }
}
