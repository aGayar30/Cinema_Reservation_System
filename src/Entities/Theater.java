package Entities;

import java.util.Vector;

public class Theater {
    private static int idCounter = 0;
    private static int NoOfSections = 0;
    private int id;
    private Vector<Section> sections = new Vector<>();

    public Theater() {
        this.id = idCounter++;
    }

    public Theater(Vector<Section> sections) {
        this();
        this.sections = sections;
    }
    
    public void appendSection(Section section) {
        sections.add(section);
    }

    public static int getNoOfSections() {
        return NoOfSections;
    }

    public int getId() {
        return id;
    }

    public Vector<Section> getSections() {
        return sections;
    }

    public void setSections(Vector<Section> sections) {
        this.sections = sections;
    }
    
    public String toString() {
        return String.format("Theater{id=%d}", id);
    }
}
