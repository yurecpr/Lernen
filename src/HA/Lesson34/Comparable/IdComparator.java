package HA.Lesson34.Comparable;

import java.util.Comparator;

class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getId(), e2.getId());
    }
}